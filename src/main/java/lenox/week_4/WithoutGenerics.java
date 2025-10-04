package lenox.week_4;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.List;

public class WithoutGenerics {


    public static <E> void printArr(E[] elements){
        for(E e : elements){
            System.out.println(e);
        }
    }


    public static void main(String[] args) {

        Integer[] intArr = {10, 20, 30, 40, 50};
        Character[] charArr = {'A', 'V', 'C', 'D'};


        System.out.println("Print Integer array");
        printArr(intArr);

        System.out.println("Print character array");
        printArr(charArr);
    }


    }
