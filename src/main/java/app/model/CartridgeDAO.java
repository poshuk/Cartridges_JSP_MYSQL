package app.model;

import app.entities.Cartridge;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CartridgeDAO {
    private static CartridgeDAO cartridgeDAO = new CartridgeDAO();
    private static final String URL = "jdbc:mysql://localhost:3306/mydbtest";
    private static final String USERNAME = "dis";
    private static final String PASSWORD = "dis";

    private CartridgeDAO(){

    }

    public static CartridgeDAO getInstance(){
        return cartridgeDAO;
    }


    public List<Cartridge> list(){
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e){
            e.printStackTrace();
        }
        List<Cartridge> cartridges = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement prepStat = connection.prepareStatement("SELECT * FROM CARTRIDGES");
            ResultSet rs = prepStat.executeQuery()){

            while (rs.next()) {
                String time = rs.getString(2).substring(0, rs.getString(2).length() - 2);

                String note;
                if (rs.getBoolean(7)){
                    note = "Претензия";
                } else {
                    note = "Нет";
                }
                Cartridge cartridge = new Cartridge();
                cartridge.setId(rs.getInt(1));
                cartridge.setDate(time);
                cartridge.setModelPrinter(rs.getString(3));
                cartridge.setModelCartridge(rs.getString(4));
                cartridge.setCompany(rs.getString(5));
                cartridge.setDepartment(rs.getString(6));
                cartridge.setNote(note);
                cartridge.setLastName(rs.getString(8));
                cartridges.add(cartridge);
            }
        } catch (SQLException e){
            throw new IllegalStateException("Cannot connect to the DB", e);
        }

        return cartridges;
    }

    public void writeToDb(Cartridge cartridge){

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e){
            e.printStackTrace();
        }

        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        PreparedStatement ps = connection.prepareStatement(
                "INSERT INTO cartridges(date, printer_model, cartridge_model, company, department, note, who_is) " +
                        "VALUES (?, ?, ?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS)){

            java.util.Date date = new java.util.Date();
            Object param = new java.sql.Timestamp(date.getTime());
            ps.setObject(1, param);
            ps.setString(2, cartridge.getModelPrinter());
            ps.setString(3, cartridge.getModelCartridge());
            ps.setString(4, cartridge.getCompany());
            ps.setString(5, cartridge.getDepartment());

            if (cartridge.getNote().equals("Претензія")){
                ps.setByte(6, Byte.parseByte("1"));
            } else {
                ps.setByte(6, Byte.parseByte("0"));
            }

            ps.setString(7, cartridge.getLastName());
            ps.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }




}
