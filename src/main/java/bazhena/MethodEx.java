package bazhena;

import jakarta.persistence.EntityListeners;

public class MethodEx {



    public String evenOrOdd(int a){
        if(a % 2 == 0){
            return "EVEN";
        }else {
            return "ODD";
        }
    }


    // 10, 20, 30, 40

    static int addNum(){
        return 0;
    }

    void printName(){
        System.out.println("John");

    }


    public int add(int a, int b){
        return a + b;
    }

    public String fullName(String firstName, String secondName){
        return firstName + " " + secondName;
    }

    public int multiplyNumbers(int a, int b, int c){
        return a * b * c;
    }


    //1 create a method that multiply 3 numbers
    // 2 create a method that return your firstname and lastname



    public static void main(String[] args) {
        MethodEx result = new MethodEx();


        MethodEx.addNum();



        System.out.println();

        System.out.println(result.add(100, 300));
        System.out.println(result.fullName("John", "Doe"));


        System.out.println(result.evenOrOdd(20));
    }

}
