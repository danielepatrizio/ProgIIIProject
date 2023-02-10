package socket;
import java.io.*;
import java.net.*;


public class InetAddressExample {
    public static void main(String [] args)
    {
        try
        {
            InetAddress address = InetAddress.getLocalHost();
            System.out.println(address.getHostAddress());
            System.out.println(address.getHostName());
            Socket socket = new Socket(address,9090);
        }
        catch (IOException e)
        {
            System.out.println((e.toString()));
        }
    }
}
