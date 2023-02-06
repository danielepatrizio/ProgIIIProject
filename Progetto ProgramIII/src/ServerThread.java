import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.net.ServerSocket;
import java.net.Socket;


class ServerThread extends Thread {
    private static DataOutputStream dataOutputStream = null;
    private static DataInputStream dataInputStream = null;

    public ServerThread(String [] args) {
        // Definiamo il socket del server con la porta 9090
        try (ServerSocket serverSocket = new ServerSocket(9090)){
            System.out.println(
                    "Server is Starting in Port 9090");
            // Accettiamo la richiesta del CLient usando il seguente metodo
            Socket clientSocket = serverSocket.accept();
            System.out.println("Connected");
            dataInputStream = new DataInputStream(clientSocket.getInputStream());
            dataOutputStream = new DataOutputStream(clientSocket.getOutputStream());
            // definiamo il file che si riceve
            receiveFile("fi");

            dataInputStream.close();
            dataOutputStream.close();
            clientSocket.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    //metodo per ricevere file
    public static void receiveFile(String fileName) throws Exception {
        int bytes = 0;
        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
        long size = dataInputStream.readLong(); // lettura size del file
        byte[] buffer = new byte[4 * 1024];
        while (size > 0 && (bytes = dataInputStream.read(buffer,0,(int)Math.min(buffer.length, size)))!= -1){

            fileOutputStream.write(buffer, 0, bytes);
            size -= bytes; // lettura del size
        }
        // qui definiamo che abbiamo ricevuto il file
        System.out.println("File Mandato");
        fileOutputStream.close();
    }

}
