package aston;

public class AddNumbers {


    private String name;   // this is encapsulation



    public int addThreeNumbers(int a, int b, int c){

        return a + b + c;

    }

    public int addFourNumbers(int a, int b, int c, int d){

        return a + b + c + d;

    }


    public int add(int y, int z){
        return y + z;
    }

    public int add(int y, int z, int w){
        return y + z + w;
    }

    public int add(int y, int z, int w, int u){
        return y + z + w + u;
    }


    public static void main(String[] args) {

        AddNumbers obj = new AddNumbers();

        obj.add(5,5);
        obj.add(5,5, 10);
        obj.add(5,5, 10, 10);
    }


}
