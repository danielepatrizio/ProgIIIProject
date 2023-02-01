import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

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
        String pathFileName= "./IdeaProjects/ProgIIIProject/filename.txt";

        File inputFile = new File(pathFileName);

        //Creo un oggetto Scanner con fonte di dati il file inputFile.txt
        //che si trova all'interno della cartella folder, all'interno del mio progetto Java
        Scanner scannerDaFile = null;
        try {
            scannerDaFile = new Scanner(inputFile);

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
    public static void Queue(String[] args)   // algoritmo per ordinare usando il FIFO
    {
        Queue<Integer> File = new LinkedList<>();

        // elementi aggiunti alla queue
        for (int i = 0; i < 5; i++)
            File.add(i);

        // mostra cosa c'è in queue
        System.out.println("Elements of queue-" + File);

        //L'elemento 0 più vecchio viene rimosso
        int removedele = File.remove();
        System.out.println("removed element-" + removedele);

        System.out.println(File);

        // Vista dell'elemento in testa nella queue
        int head = File.peek();
        System.out.println("head of queue-" + head);


        int size = File.size();
        System.out.println("Size of queue-" + size);
    }

    public static void grafo(String arg[])   {
        int V = 6;
        int source = 0;
        // lista di rappresentazione delle vicinanze del grafo
        List<List<Node> > adj_list = new ArrayList<List<Node> >();
        // lista iniziale delle vicinanze di ogni nodo nel grafo
        for (int i = 0; i < V; i++) {
            List<Node> File = new ArrayList<Node>();
            adj_list.add(File);
        }


        // input bordi del grafo
        adj_list.get(0).add(new Node(1, 5));
        adj_list.get(0).add(new Node(2, 3));
        adj_list.get(0).add(new Node(3, 2));
        adj_list.get(0).add(new Node(4, 3));
        adj_list.get(0).add(new Node(5, 3));
        adj_list.get(2).add(new Node(1, 2));
        adj_list.get(2).add(new Node(3, 3));
        // chiamato del metodo dell'algoritmo di Dijkstra
        Graph_pq dpq = new Graph_pq(V);
        dpq.algo_dijkstra(adj_list, source);

        // Stanta del percorso più breve dal nodo iniziale verso tutti i nodi
        System.out.println("The shorted path from source node to other nodes:");
        System.out.println("Source\t\t" + "Node#\t\t" + "Distance");
        for (int i = 0; i < dpq.dist.length; i++)
            System.out.println(source + " \t\t " + i + " \t\t "  + dpq.dist[i]);
    }


}
