package lenox.week_7_task.service.impl;


import lenox.week_7_task.common.SimpleHttpServer;
import lenox.week_7_task.service.HttpServerService;
import lenox.week_7_task.utils.HttpHandler;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class HttpServerServiceImpl implements HttpServerService {
    @Override
    public void start(int port) {
        try(ServerSocket serverSocket = new ServerSocket(SimpleHttpServer.PORT)){
            System.out.println("Server started on port " + port);

            while (true){
                Socket socket = serverSocket.accept();
                System.out.println("New connection established");

                new HttpHandler(socket).start();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
