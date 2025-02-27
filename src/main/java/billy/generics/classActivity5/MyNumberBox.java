package billy.generics.classActivity5;

public class MyNumberBox <T extends Number>{
    private T number;

    public void setNumber(T number) {
        this.number = number;
    }

    public double getDoubleValue(){
        return number.doubleValue();
    }

    public static void main(String[] args) {
        MyNumberBox<Integer> intBox = new MyNumberBox<>();
        //MyNumberBox<String> str = new MyNumberBox<String>();
        // T extends Number means T can only be Integer, Double, Float, etc., ensuring type safety.
        intBox.setNumber(10);
        System.out.println(intBox.getDoubleValue());
    }
}
