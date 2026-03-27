package jug.methodEx;

public class MethodEx {




    int count = 0;

    void increment(){
        count++; // Side effect :
        // it modifies the object state
    }

    void newMethod(){
        System.out.println(count);
    }


    int add(int a, int b){
        return a + b;
    }






//    public int add(int a, int b){
//        return a + b;
//    }
//
//    void addTwuNumbers(int a, int b){
//       // return a + b;
//
//        System.out.println(a + b);
//    }

//    static String fullName(String firstname, String lastname){
//
//    }





//    int a = 10;
//    int b = 20;

  //  int res = Math.max(a, b);

  //  int min = Math.min();


//    public static void isEvenOrOdd(int num){
//        if(num % 2 == 0){
//            System.out.println("EVEN NUMBER");
//        }else {
//            System.out.println("ODD NUMBER");
//        }
//    }


    public String fullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }


    public static void main(String[] args) {

      //  isEvenOrOdd(9);

        MethodEx res = new MethodEx();
//
//
//

        res.increment();

        System.out.println(res.count);
//        System.out.println(res.newMethod());

        System.out.println(res.add(2,3));

    }
}
