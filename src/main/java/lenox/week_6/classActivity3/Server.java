package lenox.week_6.classActivity3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {

        ServerSocket server = new ServerSocket(8080);

        System.out.println("Server waiting for client...");

        Socket clientSocket = server.accept();

        System.out.println("Client connected");

        DataInputStream input = new DataInputStream(clientSocket.getInputStream());
        DataOutputStream output = new DataOutputStream(clientSocket.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String message1 = "";
        String message2 = "";

        while (!message1.equalsIgnoreCase("stop")){
            message1 = input.readUTF();
            System.out.println("Client says : " + message1);
            message2 = br.readLine();
            output.writeUTF(message2);

        }
        input.close();
        output.close();
        clientSocket.close();
    }
}
