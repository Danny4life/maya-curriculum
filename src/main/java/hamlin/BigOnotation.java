package hamlin;

public class BigOnotation {

    public static void main(String[] args) {

        // O(1) Time complexity

        int[] arr = {10, 20, 30, 40, 50};


        int result = arr[0];


        System.out.println(result);
//

        // 0(n)
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }

        //0(n)2
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                System.out.println(i + " " + j);
            }
        }
    }
}
