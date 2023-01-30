package socket;
import java.io.*;
import java.net.*;
public class RemotePortScanner {
    public static void main(String [] args){

        //Creazione di un buffered reader per leggere input dell'user
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);

        String targetIp = "";  //mantiene l'ip address
        int fromPort = 0;  //mantiene la porta iniziale
        int toPort = 0;   //mantiene la porta finale

        System.out.print("Inserisci target ip address: "); //richiesta per inserire l'ip address

        try
        {
            targetIp = reader.readLine(); //lettura dell'ip
        }
        catch (Exception e)
        {
            System.out.println("Lettura ip errata " + e.toString());
        }
        //boolean per il controllo del processo
        boolean isValid = false;

        while(!isValid)
        {
           try
           {
               System.out.print("Inserisci una prima porta:  ");
               String portString = reader.readLine(); //legge la porta
               fromPort = Integer.parseInt(portString);
               if(fromPort >=0 && fromPort <= 65536)
               {
                   isValid = true;
               }
               else
               {
                   System.out.println("Porta non valida, range della porta: 0 - 65536");
               }
           }
           catch (NumberFormatException e1)
           {
               System.out.println("Inserisci un numero");
           }
           catch (Exception e)
           {
               System.out.println(e.toString());
           }


        }
        int port = fromPort;
        while(port >= fromPort && port <= toPort)
        {
            try
            {
                Socket socket = new Socket(targetIp,port);
                System.out.println("Port " + port + " è in lista");
                socket.close();
            }
            catch (UnknownHostException e1)
            {
                System.out.println("Errore di Host sconosciuto" + e1.toString());
            }
            catch (IOException e2)
            {
                System.out.println("porta " + port + " non è aperta");
            }
            catch (Exception e)
            {
                System.out.println(e.toString());
            }
            port++;
        }



    }
}
