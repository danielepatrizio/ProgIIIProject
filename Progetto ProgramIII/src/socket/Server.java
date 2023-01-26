package socket;
import  java.net.*;
import java.io.*;

public class Server {

    public static void main(String [] args) throws Exception
    {
        ServerSocket serverSocket = new ServerSocket(9090);
        System.out.println("Aspettando client....");
        boolean stop = false;
        while(!stop){
        Socket socket = serverSocket.accept();
        PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
        out.println("Benvenuto");
        BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String clientInput = input.readLine();
        System.out.println(clientInput);
        input.close();
        out.close();

        socket.close();


        }
    }
}