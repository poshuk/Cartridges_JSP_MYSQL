package app.servlets;

import app.entities.Cartridge;
import app.model.CartridgeDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/views/add.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        Cartridge cartridge = new Cartridge();
        cartridge.setModelPrinter(req.getParameter("printer_model"));
        cartridge.setModelCartridge(req.getParameter("cartridge_model"));
        cartridge.setCompany(req.getParameter("company"));
        cartridge.setDepartment(req.getParameter("department"));
        cartridge.setNote(req.getParameter("claim"));
        cartridge.setLastName(req.getParameter("executor"));

        CartridgeDAO cartridgeDAO = CartridgeDAO.getInstance();
        cartridgeDAO.writeToDb(cartridge);

        resp.sendRedirect("/");
    }
}
