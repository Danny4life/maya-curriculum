package aiz.twoDarray;

public class MaxFinder {

    public int findMax(int[][] num){

        int max = num[0][0];

        for(int i  = 0; i < num.length; i++){
            for(int j = 0; j < num[i].length; j++){
                if(num[i][j] > max){
                    max = num[i][j];
                }
            }
        }
        return max;
    }


    public static void main(String[] args) {

        int[][] num = {
                {3,7,2},
                {9,1,4},
                {6,8,5}
        };
    }
}
