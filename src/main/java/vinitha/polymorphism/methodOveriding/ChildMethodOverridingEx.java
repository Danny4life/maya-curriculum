package vinitha.polymorphism.methodOveriding;

public class ChildMethodOverridingEx extends ParentMethodOverridingEx{


    @Override
    String sing(String fullName){
        return fullName + "can sing very well than the parent";
    }



    @Override
    String walk(String name){
        return name + " is walking to school";
    }

    @Override
    int calculate(int sum){
        return sum + 50;
    }


    public static void main(String[] args) {
        ChildMethodOverridingEx child = new ChildMethodOverridingEx();

        System.out.println(child.sing("Junior "));
    }
}
