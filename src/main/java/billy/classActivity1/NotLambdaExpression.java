package billy.classActivity1;

public class NotLambdaExpression {

    public static void main(String[] args) {

        int width = 10;

        // this is without lambda
//        Drawable d = new Drawable() {
//            @Override
//            public void draw() {
//                System.out.println("Drawing " + width);
//            }
//        };
//        d.draw();


        // this is with lambda
        Drawable d2 = ()-> {
            System.out.println("Drawing " + width);
        };
        d2.draw();


    }
}
