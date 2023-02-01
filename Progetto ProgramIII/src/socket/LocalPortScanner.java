package socket;
import java.io.*;
import java.net.*;

// lettura porta locale
public class LocalPortScanner {
    public static void main(String [] args)
    {
        int port= 1;
        // legge fino ad un massimo di 65535
        while(port <= 65535){
        try
      {
        ServerSocket server = new ServerSocket(port);
      }
      catch(IOException e)
     {
        System.out.println("porta " + port + " aperta");
    }
        port++;
        }
    }
    }
