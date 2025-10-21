package henry.week_6.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientClass {

    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("localhost", 12345);


       // PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

        //    BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        //    output.println("Hello from client!");

        //    String response = input.readLine();
       // System.out.println("SERVER : " + response);

//        input.close();
//        output.close();
//        socket.close();


    }
}
