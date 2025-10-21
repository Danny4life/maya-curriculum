package henry.week_5.classActivity1;

public class NotLambdaExpression {

    public static void main(String[] args) {

        int width = 10;
//        Drawable d = new Drawable() {
//            @Override
//            public void draw() {
//                System.out.println("Drawing " + width);
//            }
//        };
//        d.draw();


        Drawable d1 = ()->{System.out.println("Drawing " + width);};
        d1.draw();


    }
}
