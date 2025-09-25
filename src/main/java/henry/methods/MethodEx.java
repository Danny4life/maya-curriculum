package henry.methods;

public class MethodEx {



    public static String evenOrOdd(int n){

        if(n % 2 == 0){
            return "EVEN";
        }else {
            return "ODD";
        }

    }
    public static void main(String[] args) {

        System.out.println(evenOrOdd(11));
    }

}
