package Sriza.oop.solidPrinciples.classActivity1;

public class Employee {
    String name;
    double salary;

    // Constructor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double calculateSalary() {
        return salary * 1.1; // Adding 10% bonus
    }

    //Bad Responsibility 2: Save employee data to a database (SRP Violation)
    public void saveToDatabase() {
        System.out.println("Saving " + name + " to the database.");
    }

    /**
     * Why is This a Problem?
     * Different Reasons for Change:
     * If we change how the salary is calculated, we need to modify the Employee class.
     * If we change the database storage method, we again modify the Employee class.
     * Mixing Business Logic with Persistence Logic:
     * calculateSalary() is a business rule (related to salary calculations).
     * saveToDatabase() is data persistence (related to storing data).
     * Difficult to Test and Maintain:
     * A developer working on salary calculations should not worry about database changes.
     */
}
