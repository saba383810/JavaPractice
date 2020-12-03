package pkg10syou;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class SimpleClient {
    public static void main(String[] args) {
        try{
            Socket socket = new Socket("192.168.11.18",5000);
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String message = reader.readLine();
            System.out.println("サーバーから受け取った文字列:"+message);

        }catch (IOException e){
            System.out.println(e);
        }
    }
}
