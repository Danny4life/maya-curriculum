package henry.week_5.classActivity7;

import java.util.Optional;

public class OptionalEx {

    public static void main(String[] args) {

        String[] num = new String[10];

      //  String low = num[5].toLowerCase();

       // System.out.println(low);

        Optional<String> checkSum = Optional.ofNullable(num[5]);

        if(checkSum.isPresent()){
            String low = num[5].toLowerCase();
            System.out.println(low);
        }else {
            System.out.println("String value is not present");
        }
    }
}
