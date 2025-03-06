package Sriza.oop.classActivity3C;

public class PrintMessageEx {
    void display(String message, int times){

        for(int i = 0; i < times; i++){
            System.out.println(message);
        }

    }


    void display(int times, String message){
        for(int i = 0; i < times; i++){
            System.out.println(message.toUpperCase());
        }

    }

    public static void main(String[] args) {
        PrintMessageEx msg = new PrintMessageEx();

        msg.display("Hello World", 1);
        msg.display(2, "hello world");
    }
}
