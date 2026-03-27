package vinitha.polymorphism;

public class CalculateNumbers {


    //Polymorphism through method overloading - where the method has same name but different parameters
    public int calculate(int num1, int num2){
        return num1 + num2;
    }

    public int calculate(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    public int calculate(int num1, int num2, int num3, int num4){
        return num1 + num2 + num3 + num4;
    }


}
