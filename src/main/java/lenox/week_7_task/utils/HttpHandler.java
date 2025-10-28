package lenox.week_7_task.utils;

import lenox.week_7_task.common.SimpleHttpServer;

import java.io.*;
import java.net.Socket;

public class HttpHandler extends Thread{

    private Socket socket;


    public HttpHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try(BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true)){


            String request = input.readLine();

            if(request != null){
                String[] parts = request.split("\\s+");

                if(parts.length >= 2 && parts[0].equals("GET")){
                    String path = parts[1];
                    if(path.equals("/") || path.equals("index.html")){
                        sendNewHtmlResponse(output);
                    }else if(path.equals("/json")){
                        sendNewJsonResponse(output);

                    }else {
                        sendNewNotFoundResponse(output);
                    }
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);

        }finally {
            try {
                socket.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }

    private void sendNewHtmlResponse(PrintWriter output) {

        File file = new File(SimpleHttpServer.HTML_FILE_PATHS);

        if(file.exists()){
            sendResponse(output, file, "text/html");

        }else {
            sendNewNotFoundResponse(output);
        }

    }



    private void sendNewJsonResponse(PrintWriter output) {
        File file = new File(SimpleHttpServer.JSON_FILE_PATHS);

        if(file.exists()){
            sendResponse(output, file, "application/json");

        }else {
            sendNewNotFoundResponse(output);
        }
    }

    private void sendNewNotFoundResponse(PrintWriter output) {
        output.println("HTTP/1.1 404 NOT FOUND");
        output.println("Content-Type: text/plain");
        output.println();
        output.println("404 NOT FOUND - The request resource was not found on this server.");
    }

    private void sendResponse(PrintWriter output, File file, String contentType) {
        output.println("HTTP/1.1 200 OK");
        output.println("Content-Type: " + contentType);
        output.println();

        try(BufferedReader reader = new BufferedReader(new FileReader(file))){
            String line;
            while ((line = reader.readLine()) != null){
                output.println(line);
                System.out.println(line);

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
