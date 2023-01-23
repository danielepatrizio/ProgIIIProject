import java.io.*;
import java.net.*;
class ServerThread extends Thread {
    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;


         public ServerThread(Socket s) throws IOException {
         socket = s;

         in = new BufferedReader(new InputStreamReader(
                 socket.getInputStream()));
         out =new PrintWriter(new BufferedWriter(
                 new OutputStreamWriter(socket.getOutputStream())),
         true);
         start();
         }
} // continua