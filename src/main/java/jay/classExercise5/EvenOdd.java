package jay.classExercise5;

public class EvenOdd {

    public String evenOdd(int num){

        if(num % 2 == 0){
            return "EVEN";
        }else {
            return "ODD";
        }
    }


    public static void main(String[] args) {

        EvenOdd res = new EvenOdd();

        String output = res.evenOdd(7);

        System.out.println(output);
    }
}
