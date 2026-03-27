package vinitha.polymorphism.methodOveriding;


public class ParentMethodOverridingEx {


    String sing(String name){
        return name + "Can sing";
    }


    String walk(String name){
        return name + " is walking to work";
    }

    int calculate(int num){
        return num;
    }


    public static void main(String[] args) {

        ParentMethodOverridingEx parent = new ParentMethodOverridingEx();

        System.out.println(parent.sing("John "));

        System.out.println(parent.walk("John"));
    }

}
