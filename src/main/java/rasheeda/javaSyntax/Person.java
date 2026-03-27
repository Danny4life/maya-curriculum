package rasheeda.javaSyntax;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



//Annotation
public class Person {



    String name;  // Instance variable

    Gender gender; // Instance variable


    public static String phoneNumber;


    public Person(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }



    public static String getPhoneNumber() {
        return phoneNumber;
    }

    public static void setPhoneNumber(String phoneNumber) {
        Person.phoneNumber = phoneNumber;
    }

    static void myMethod(){
        System.out.println("hryyyyy");
    }


    void name(){
       int num = 20; // local variable

        num = 300;

        num = 50;
    }


    public static void main(String[] args) {

        Person person1 = new Person("John", Gender.MALE);
        Person person2 = new Person("Jane", Gender.FEMALE);

        System.out.println(person1);
        System.out.println(person2);



    }





}
