package olga.classActivity1A;

public class ArrayExample {


    // breakdown and explain the print method algorithm
    public void printArray(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public void myArrayDemo(){

        // here we already know what values the array will hold before hand
        int[] arr = {1,2,3,4,5}; // default index values 0, 1, 2, 3, 4
        System.out.println("Access element at index 2 is: " + arr[2]);

        arr[2] = 10;

        System.out.println("Updated element at index 2 is: " + arr[2]);


        // show default values first

//        int[] arr = new int[10];
//        arr[0] = 1;
//        arr[1] = 2;
//        arr[2] = 3;
//        arr[3] = 4;
//        arr[4] = 5;
//        arr[5] = 6;
//        arr[6] = 7;
//        arr[7] = 8;
//        arr[8] = 9;
//        arr[9] = 10;
//        arr[2] = 10; for modifying the value at the index

        printArray(arr);

        System.out.println("Total length of the array is: " + arr.length); // to get the lenght of an array
        System.out.println("The last element of the array stored at index 4 is: " + arr[arr.length - 1]); // to get the last element of an array
    }

    public static void main(String[] args) {
        // ignore this code commented
        // Declare and initialize
     //   int[] arr = {1,2,3,4,5};
        // Access an element
      //  System.out.println("Access element at index 2: " + arr[2]);

        // modify an element
     //   arr[2] = 10;

       // System.out.println("Updated element at index 2: " + arr[2]);



        // also show that the default values will be 0,0,0,0,0 before assigning values
//        int[] myArray = new int[5];
//
//        myArray[0] = 1;
//        myArray[1] = 1;
//        myArray[2] = 1;
//        myArray[3] = 1;
//        myArray[4] = 1;
     //   myArray[2] = 10; use this to update the element at index 2

       // System.out.println(Arrays.toString(myArray));


        ArrayExample example = new ArrayExample();
        example.myArrayDemo();
        example.printArray(new int[] {1,2,3,4,5});
    }
}
