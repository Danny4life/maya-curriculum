package bazhena.zooApplication;

abstract public class Animal {

    private String name;

    private String color;


    void run(){
        System.out.println(name + " is running");
    }

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }


    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}
