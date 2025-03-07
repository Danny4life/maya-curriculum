package Sriza.oop.classActivity5B;

public class Department2 extends Organization{
    public Department2(String deptName, String KPI) {
        super(deptName, KPI);
    }

    @Override
    public void display() {
        System.out.println("Department Name: " + getDeptName() + "\n" + "KPI: " + getKPI());
    }
}
