package billy.oop.classActivity3;

public class Employee {
    int id;

    String name;

    Address address;

    public Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display(){
        System.out.println("Employee ID and Name: " + id + ", " + name);
        System.out.println("Employee Address: " + address.city + ", " + address.state + ", " + address.country + ".");
    }

    public static void main(String[] args) {

        Address address1 = new Address("Ikeja", "Lagos", "Nigeria");

        Employee employee = new Employee(1, "John", address1);


        employee.display();


    }
}
