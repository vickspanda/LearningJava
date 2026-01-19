package vehicle;

public class Car {
    protected int wheelCount;
    protected String Color;
    private String Company;
    public boolean isManual;
    int Model;

    protected void setCompany(String name){
        this.Company = name;
    }
    protected String getCompany(){
        return this.Company;
    }
}
