package Sriza.oop.solidPrinciples.classActivity2;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", 5000);

        SalaryCalculator salaryCalc = new SalaryCalculator();
        System.out.println("Salary: $" + salaryCalc.calculateSalary(emp));

        EmployeeDatabase db = new EmployeeDatabase();
        db.saveToDatabase(emp);
    }
}
