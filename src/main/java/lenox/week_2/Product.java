package lenox.week_2;

import lenox.week_2.polymorphism.BaseClass;
import lenox.week_2.polymorphism.MyInterface;

import java.time.LocalDate;

public class Product extends BaseClass implements MyInterface {

  String productName;

  double productAmount;

    @Override
    public void abstractMethod() {

    }

    @Override
    public void anotherMethod() {
        System.out.println();
    }

    @Override
    public String name() {
        return "John";
    }

    @Override
    public int addNumbers() {
        return 0;
    }
}
