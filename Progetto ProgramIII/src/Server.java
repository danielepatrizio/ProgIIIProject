import java.io.*;
import java.net.*;
public class Server {
static final int PORT = 8080;
public static void main(String[] args) throws IOException {
    try (ServerSocket s = new ServerSocket(PORT)) {
        while (true) {
            Socket socket = s.accept();
            try {
                new ServerThread(socket); // conn <-> thread
            } catch (IOException e) {
                socket.close();
            }
        }
    }
         }
}