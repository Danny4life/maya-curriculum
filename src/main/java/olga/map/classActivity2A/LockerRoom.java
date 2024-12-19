package olga.map.classActivity2A;

import java.util.HashMap;

public class LockerRoom {

    public static void main(String[] args) {
        // Create a HashMap to store locker items
        HashMap<String, String> locker = new HashMap<>();

        // Adding items to the locker
        locker.put("A1", "Shoe");
        locker.put("B2", "Bag");
        locker.put("C3", "Shirt");

        // Retrieve an item from the locker
        System.out.println("Item in locker A1: " + locker.get("A1"));

        // Check if a key exists
        System.out.println("Does locker B2 exists? " + locker.containsKey("B2"));

        // Replace an item in the locker
        locker.put("A1", "Sports Shoes");
        System.out.println("Updated item in locker A1: " + locker.get("A1"));

        // Remove an item
        locker.remove("C3");
        System.out.println("Does Locker C3 items exists? " + locker.containsKey("C3"));

        // for checking hash code conversion
        System.out.println("123 % 16 is : " + 123%16);

        /**
         * How Does It Actually Work Internally?
         * Let’s break it down step by step:
         * step 1. For Adding a Key-Value Pair:
         *-- locker.put("A1", "Shoes");
         * -- The key "A1" is converted into a hash code (e.g., 123).
         * -- Then the hash code is used to calculate a bucket index (e.g., 123 % 16 = 11, if the map has 16 buckets).
         * -- 16 is the default capacity of a hashmap bucket
         * -- The value "Shoes" is stored in bucket 11.
         *
         * step 2. For getting a value -- locker.get("A1");
         * -- The HashMap converts "A1" to the same hash code (123).
         * -- It calculates the bucket index again (123 % 16 = 11).
         * -- It looks in bucket 11 and finds "Shoes".
         *
         * Step 3. in case there is collision
         * Handling Collisions: If another key, say "B1", also ends up with a hash code that maps to bucket 11,
         * it will be stored as a linked list or a tree node in the same bucket.
         *
         * then show a visual representation of how it is linked when there is collision
         *
         */
    }


}
