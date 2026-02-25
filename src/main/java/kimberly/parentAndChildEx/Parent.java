package kimberly.parentAndChildEx;

public class Parent {

    int height;

    String color;

    public Parent(int height, String color) {
        this.height = height;
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    void canSing(){
        System.out.println("Singing...");
    }


    void display(){
        System.out.println("My height is : " + height + " " + " and my color is : " + color);
    }
}
