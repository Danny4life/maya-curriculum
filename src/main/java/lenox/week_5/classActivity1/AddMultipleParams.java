package lenox.week_5.classActivity1;

public class AddMultipleParams {
    public static void main(String[] args) {


        Addable add = (n1, n2) -> n1 + n2;
        System.out.println(add.add(10, 10));
    }
}
