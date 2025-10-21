package henry.week_6.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerClass {

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(12345);


        System.out.println("Server waiting for client...");

        Socket clientSocket = server.accept();


        System.out.println("Client connected");

        BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        PrintWriter output = new PrintWriter(clientSocket.getOutputStream());

        String message = input.readLine();
        System.out.println("Client : " + message);

        output.println("Hello from server");

        input.close();
        output.close();
        clientSocket.close();
        server.close();




    }
}
