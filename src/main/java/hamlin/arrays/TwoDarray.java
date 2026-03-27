package hamlin.arrays;

import java.util.Arrays;

public class TwoDarray {

    public static void main(String[] args) {

        int [][] num = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };



        for(int i = 0; i < num.length; i++){
            for(int j = 0; j < num[i].length; j++){
                System.out.println(num[i][j]);
            }
        }

        /**
         * create a 3 by 3 2D array and fill it with numbers 1 to 9
         */
    }
}
