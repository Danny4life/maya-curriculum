package bazhena;

public class RotateArrayByNTimes {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        int n = 3;

        n = n % arr.length; // to handle n > length

        for(int i = 0; i < n; i++){
            int first = arr[0];

            for(int j = 0; j < arr.length - 1; j++){
                arr[j] = arr[j + 1];
            }

            arr[arr.length - 1] = first;
        }

        for(int result : arr){
            System.out.print(result + " ");
        }
    }
}
