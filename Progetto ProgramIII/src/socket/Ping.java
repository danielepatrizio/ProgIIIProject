package socket;
import java.io.*;
import java.net.*;

public class Ping {
    public static void main(String [] args)
    {
        try
        {
            String hostAddress = "25.77.94.52";
            InetAddress host = InetAddress.getByName(hostAddress);
            System.out.println(host.isReachable(1000));

            Process p = Runtime.getRuntime().exec("ping " + hostAddress);
            BufferedReader inputStream = new BufferedReader(new InputStreamReader(p.getInputStream()));

            String commandOutput = "";
            boolean isReachable = true;  //lettura output

            while((commandOutput = inputStream.readLine()) != null)
            {

                if(commandOutput.contains("non raggiungibile"))
                {
                    isReachable = false;
                    break;
                }
            }
            if(isReachable)
            {
                System.out.println("L'Host è raggiungibile");
            }
            else
            {
                System.out.println("l'Host non è raggiungibile");
            }

        }
        catch (Exception e)
        {
            System.out.println(e.toString());
        }

    }
    }
