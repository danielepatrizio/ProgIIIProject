package socket;
import java.net.*;
import java.io.*;


//Il server può mantere più persone collegate contemporaneamente
public class MultiThreadedServer {
    public static void main(String [] args)
    {
        try {
            ServerSocket serverSocket = new ServerSocket(9090);
            boolean stop = false;
            while(!stop)
            {
                System.out.println("In attesa di persone....");
                Socket clientSocket = serverSocket.accept();
                System.out.println("Cliente connesso");
                ClientThread clientThread = new ClientThread(clientSocket);
                clientThread.start();
            }
        }
        catch (Exception e)
        {
             System.out.println(e.toString());
        }

    }

}
