package hamlin.zooApp;

public class Animal { // SUPER CLASS

    private String name; // FIELDS / ATTRIBUTES

    private String color;




    void run(){
        System.out.println("Animal can run");
    }


    // All Arguement constructor
    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }


    // No Arguement constructor
    public Animal() {
    }


    int calculateTwoNumbers(int num1, int num2){
        return num1 + num2;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
