package henry.week_4.classActivity7;

public class GenericMethod {

    public static <E> void printArr(E[] elements){

        for(E e : elements){
            System.out.println(e);
        }

    }


    public static void main(String[] args) {

        Integer[] intArr = {10, 20, 30, 40, 50};
        Character[] charArr = {'A', 'B', 'C', 'D'};


        System.out.println("Print integer array");
        printArr(intArr);


        System.out.println("Print character array");
        printArr(charArr);
    }




}
