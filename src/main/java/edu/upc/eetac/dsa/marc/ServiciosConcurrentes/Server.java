package edu.upc.eetac.dsa.marc.ServiciosConcurrentes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class Server implements Runnable {
    private int port;
    private Thread thread;

    public final static int DEFAULT_PORT = 3333;

    public Server(int port) {
        this.port = port;
    }

    public void startServer() {
        if (thread == null)
            (thread = new Thread(this, "Server main thread")).start();
    }


    public void run() {
        try {
            ServerSocket ss = new ServerSocket(port);
            System.out.println("Chat server up, listening at " + port);
            while (true) {
                Socket socket = ss.accept();
                (new Thread(new App(socket))).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        int port = (args.length == 1) ? Integer.parseInt(args[0]) : DEFAULT_PORT;
        Server server = new Server(port);
        server.startServer();
    }
}