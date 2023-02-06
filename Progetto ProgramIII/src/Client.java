import java.io.*;
import java.net.*;

public class Client extends ServerThread {
    private static DataOutputStream dataOutputStream = null;
    private static DataInputStream dataInputStream = null;

    public Client(String[] args) {
        super(args);
    }

    public static void main(String[] args)
    {
        // Connessione del socket alla porta 9090
        try (Socket socket = new Socket("localhost", 9090)) {

            dataInputStream = new DataInputStream(
                    socket.getInputStream());
            dataOutputStream = new DataOutputStream(
                    socket.getOutputStream());
            System.out.println("Sending the File to the Server");
            // Chiamata del metodo SendFIle
            sendFile("C:/Users/Diego/IdeaProjects/ProgIIIProject/filename.txt");
            dataInputStream.close();
            dataInputStream.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    // Definizione della funzione sendFile
    private static void sendFile(String path) throws Exception{
        int bytes = 0;
        // Apertura del file in base alla sua posizione
        File file = new File(path);
        FileInputStream fileInputStream = new FileInputStream(file);

        // File mandato al Server
        dataOutputStream.writeLong(file.length());
        //Fermiamo i file nei chunk
        byte[] buffer = new byte[4 * 1024];
        while ((bytes = fileInputStream.read(buffer)) != -1) {
            // Manda il file nel server socket
            dataOutputStream.write(buffer, 0, bytes);
            dataOutputStream.flush();
        }
        // chiusura file
        fileInputStream.close();
    }

}
