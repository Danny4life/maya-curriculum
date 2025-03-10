package Sriza.oop.classActivity8;

public class Room {
    private String name;
    private int size;

    public Room(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void showRoomDetails() {
        System.out.println("Room: " + name + ", Size: " + size + " sq ft");
    }
}
