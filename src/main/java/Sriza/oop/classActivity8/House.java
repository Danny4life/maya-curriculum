package Sriza.oop.classActivity8;

public class House {
    private String address;
    private Room room1; // Composition: House "owns" Room
    private Room room2;

    public House(String address, String room1Name, int room1Size, String room2Name, int room2Size) {
        this.address = address;
        this.room1 = new Room(room1Name, room1Size);
        this.room2 = new Room(room2Name, room2Size);
    }

    public void showHouseDetails() {
        System.out.println("House Address: " + address);
        room1.showRoomDetails();
        room2.showRoomDetails();
    }
}
