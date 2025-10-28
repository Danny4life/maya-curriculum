package lenox.week_7_task;

import lenox.week_7_task.common.SimpleHttpServer;
import lenox.week_7_task.service.impl.HttpServerServiceImpl;

public class Main {

    public static void main(String[] args) {

        HttpServerServiceImpl service = new HttpServerServiceImpl();

        service.start(SimpleHttpServer.PORT);


    }
}
