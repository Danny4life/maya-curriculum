package billy.oop.classActivity4C;

public class PrintMessage {

    //Overloading method by Changing Parameter Order
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
        PrintMessage msg = new PrintMessage();

        msg.display("Hello World", 1);
        msg.display(2, "hello world");

        // The method works differently based on the parameter order.
    }
}
