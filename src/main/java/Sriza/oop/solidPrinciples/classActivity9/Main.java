package Sriza.oop.solidPrinciples.classActivity9;

public class Main {
    public static void main(String[] args) {

        /**
         * what if we want each users to connect to different DB one to mysql and the other postgres
         */
        UserService user1 = new UserService();

        UserService user2 = new UserService();

        System.out.println("user1");
        user1.getUser();

        System.out.println("user2");
        user2.getUser();
    }
}
