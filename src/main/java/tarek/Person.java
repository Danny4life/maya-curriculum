package tarek;

import java.util.Arrays;

// TASK 1
public class Person {

    String name;
    String nationality;
    String dateOfBirth;
    String[] passport;
    int seatNumber;

    // for workbook 2
    public Person(String name, String nationality, String dateOfBirth, int seatNumber) {
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.seatNumber = seatNumber;
    }


    // workbook 3
    // Getter for name (to use in messages)
    public String getName() {
        return this.name;
    }


    /**
     * workbook 3 Task 1
     * Function name: applyPassport
     * @return (boolean) - randomly returns true or false
     * When Math.random() produces a value in the range [0.0, 0.5) → (int)(...)
     * becomes 0 → function returns false → you get we are sorry:
     * When Math.random() produces a value in the range [0.5, 1.0) → (int)(...)
     * becomes 1 → function returns true → you get congratulation:
     */
    public boolean applyPassport() {
        int number = (int) (Math.random() * 2); // 0 or 1
        return number == 1;  // no if-else needed
    }

    /**
     * workbook 3 Task 2
     * Function name: chooseSeat
     * Sets seatNumber to a random number between 1 and 11
     */
    public void chooseSeat() {
        this.seatNumber = (int) (Math.random() * 11 + 1);
    }




    public static void main(String[] args) {

        // workbook 1 Task 2
//        Person person = new Person();
//
//        System.out.println(person.name);
//        System.out.println(person.nationality);
//        System.out.println(person.dateOfBirth);
//        System.out.println(Arrays.toString(person.passport));
//        System.out.println(person.seatNumber);
//
//        System.out.println("----- After Updating Fields -----");
//
//        person.name = "Rayan Slim";
//        person.nationality = "Canadian";
//        person.dateOfBirth = "01/01/1111";
//        person.passport = new String[] { person.name, person.nationality, person.dateOfBirth };
//        person.seatNumber = 5;

        // Task 4: Print updated fields
//        System.out.println(person.name);
//        System.out.println(person.nationality);
//        System.out.println(person.dateOfBirth);
//        System.out.println(Arrays.toString(person.passport));
//        System.out.println(person.seatNumber);


        // workbook 2 & 3
        Person person = new Person("Rayan Slim", "Canadian", "01/01/1111", 5);

        // Task 3: Print every field in one String
//        System.out.println("Name: " + person.name + "\n" +
//                "Nationality: " + person.nationality + "\n" +
//                "Date of Birth: " + person.dateOfBirth + "\n" +
//                "Seat Number: " + person.seatNumber + "\n");



        // workbook 3 Task 4: Before printing result, choose another seat
        person.chooseSeat();

        // Print details
        System.out.println("Name: " + person.name);
        System.out.println("Nationality: " + person.nationality);
        System.out.println("Date of Birth: " + person.dateOfBirth);
        System.out.println("Seat Number: " + person.seatNumber);

        System.out.println();

        System.out.println();




        // Apply for passport
        if (person.applyPassport()) {
            System.out.println("Congratulations " + person.getName() + ". Your passport was approved!");
        } else {
            System.out.println("We are sorry " + person.getName() + ". We cannot process your application.");
        }
    }




    // <1, "Boy">
    // <2, "Boy">



}
