import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Main{

    //creazione porte per il router//
    public static void main(String[] args) {
      ServerThread thread = new ServerThread("Server1");
        ServerThread thread2 = new ServerThread("Server2");
        thread2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(thread2.getName() + " priority: " + thread2.getPriority());
      thread.start();
      thread2.start();
    }


    //lettura file
public void GetFileInfo(){

        //Path della posizione su disco del file di testo che vogliamo leggere in input
        String pathFileName= "./folder/inputFile.txt";

        File inputFile = new File(pathFileName);

        //Creo un oggetto Scanner con fonte di dati il file inputFile.txt
        //che si trova all'interno della cartella folder, all'interno del mio progetto Java
        Scanner scannerDaFile = null;
        try {
            scannerDaFile = new Scanner(inputFile);

            System.out.println("------------------ STAMPA DEL FILE DI TESTO: "+inputFile.getName()+" ----------------------");

            while(scannerDaFile.hasNextLine()) {
                System.out.println(scannerDaFile.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            if(scannerDaFile!=null) {
                scannerDaFile.close();
            }
        }

     }
    public static void Queue(String[] args)   //FIFO
    {
        Queue<Integer> q = new LinkedList<>();

        // Adds elements {0, 1, 2, 3, 4} to queue
        for (int i = 0; i < 5; i++)
            q.add(i);

        // Display contents of the queue.
        System.out.println("Elements of queue-" + q);

        // To remove the head of queue.
        // In this the oldest element '0' will be removed
        int removedele = q.remove();
        System.out.println("removed element-" + removedele);

        System.out.println(q);

        // To view the head of queue
        int head = q.peek();
        System.out.println("head of queue-" + head);

        // Rest all methods of collection interface,
        // Like size and contains can be used with this
        // implementation.
        int size = q.size();
        System.out.println("Size of queue-" + size);
    }
    public static void grafo(String[] args) //grafo ordinato con dijkstra
    {
        //example graph is given below
        int graph[][] = new int[][] {
                { 0, 2, 1, 0, 0, 0},
                { 2, 0, 7, 0, 8, 4},
                { 1, 7, 0, 7, 0, 3},
                { 0, 0, 7, 0, 8, 4},
                { 0, 8, 0, 8, 0, 5},
                { 0, 4, 3, 4, 5, 0}
        };
        Graph_Shortest_Path g = new Graph_Shortest_Path();
        g.algo_dijkstra(graph, 0);
    }
}
