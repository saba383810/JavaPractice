package pkg10syou;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
    public static void main(String[] args) {
        try{
            ServerSocket serverSocket = new ServerSocket(5000);
            while(true){
                Socket socket = serverSocket.accept();
                PrintWriter writer = new PrintWriter(socket.getOutputStream());
                writer.println("Hi! I'm kenta.");
                writer.close();
            }

        }catch (IOException e){
            System.out.println(e);
        }
    }
}
