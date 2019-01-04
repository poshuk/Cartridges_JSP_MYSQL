package app.entities;


public class Cartridge {
    private Integer id;
    private String date;
    private String modelPrinter;
    private String modelCartridge;
    private String company;
    private String department;
    private String note;
    private String lastName;

    public Integer getId() {
        return this.id;
    }

    public String getDate(){
        return this.date;
    }

    public String getModelPrinter() {
        return this.modelPrinter;
    }

    public String getModelCartridge() {
        return this.modelCartridge;
    }

    public String getCompany() {
        return this.company;
    }

    public String getDepartment() {
        return this.department;
    }

    public String getNote() {
        return this.note;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDate(String date){
        this.date = date;
    }

    public void setModelPrinter(String modelPrinter){
        this.modelPrinter = modelPrinter;
    }

    public void setModelCartridge(String modelCartridge){
        this.modelCartridge = modelCartridge;
    }

    public void setCompany(String company){
        this.company = company;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public void setNote(String note){
        this.note = note;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

}
