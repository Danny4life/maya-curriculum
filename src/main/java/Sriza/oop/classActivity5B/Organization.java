package Sriza.oop.classActivity5B;

abstract public class Organization {

    private String deptName;

    private String KPI;

    public Organization(String deptName, String KPI) {
        this.deptName = deptName;
        this.KPI = KPI;
    }

    public String getDeptName() {
        return deptName;
    }

    public String getKPI() {
        return KPI;
    }

    public abstract void display();
}
