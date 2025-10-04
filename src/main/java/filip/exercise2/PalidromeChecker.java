package filip.exercise2;

/**
 * function palidrome(str):
 *  if str is null:
 *      return false
 *
 *      normalize the str
 *      - to remove spaces
 *      - convert to lowercase
 *
 *      left = 0
 *      right = length(str) - 1
 *
 *      while left < right:
 *          if str[left] != str[right]:
 *              return false
 *            left = left + 1
 *            right = right - 1
 *
 *            return true
 *
 *
 */

public class PalidromeChecker {


    public static boolean isItAPalidrome(String str){

        if(str == null){
            return false;
        }

        str = str.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }

            left++;
            right--;

        }

        return true;

    }

    public static void main(String[] args) {
        String word1 = "madam";
        String word2 = "Hello";

        String word3 = "NaN";


        System.out.println(word1 + " is palidrome? " + isItAPalidrome(word1));
        System.out.println(word2 + " is palidrome? " + isItAPalidrome(word2));
        System.out.println(word3 + " is palidrome? " + isItAPalidrome(word3));

    }





}
