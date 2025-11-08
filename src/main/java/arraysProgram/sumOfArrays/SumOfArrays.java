package arraysProgram.sumOfArrays;

public class SumOfArrays {


     int[] arr = { 7, 4, 10, 9, 13, 26};




    public  int sumArray() {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }

        return sum;

    }

    public static void main(String[] args) {


        SumOfArrays res = new SumOfArrays();
        System.out.println(res.sumArray());


    }
}
