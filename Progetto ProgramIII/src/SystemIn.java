import java.io.*;

// inserimento da User di porta e ip
public class SystemIn {
    public static void main(String [] args){
        System.out.print("Inserisci numero della porta:  ");

        InputStreamReader in = new InputStreamReader(System.in); // buffer per la lettura di string

        BufferedReader reader = new BufferedReader(in);

        boolean isValid = false;
        int port = 0;

        while(!isValid)
        {
            try
            {
                String portString = reader.readLine();
                port = Integer.parseInt(portString);
                System.out.println("porta corretta");
                isValid = true;
            }
            catch (Exception e)
            {
                System.out.println("inserisci un numero");
                System.out.println("inserisci numero porta");

            }
        }
         System.out.print("Inserisci Ip del server:  ");

        String ipAddress = "";

        try
        {
            ipAddress= reader.readLine();
        }
        catch (Exception e)
        {
            System.out.println("Ip non valido: " + e.toString());
        }

        System.out.println("");
        System.out.println("..........................");
        System.out.println("");

        System.out.println("Prova a connetterti all'Ip: " + ipAddress + " sulla porta: " + port + "...");

    }
}
