package lenox.week_5.classActivity1;

public class NotLambdaExpression {

    public static void main(String[] args) {

        int width = 10;

        // Non functional program

//        Drawable d = new Drawable() {
//            @Override
//            public void draw() {
//                System.out.println("Drawing " + width);
//            }
//        };
//        d.draw();

        // Functional program

        Drawable d2 = () -> {System.out.println("Drawing " + width);};
        d2.draw();
    }




}
