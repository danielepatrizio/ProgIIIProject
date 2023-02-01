import java.util.*;

//algoritmo per la creazione del grafo

class Graph_pq {
    int dist[];
    Set<Integer> visited;
    PriorityQueue<Node> pqueue;
    int V; // numero dei vertici
    List<List<Node> > adj_list;
    //costruttore della classe
    public Graph_pq(int V) {
        this.V = V;
        dist = new int[V];
        visited = new HashSet<Integer>();
        pqueue = new PriorityQueue<Node>(V, new Node());
    }

    // Implementazione dell'algoritmo di Dijkstra
    public void algo_dijkstra(List<List<Node> > adj_list, int src_vertex)
    {
        this.adj_list = adj_list;

        for (int i = 0; i < V; i++)
            dist[i] = Integer.MAX_VALUE;

        // aggiunta del vertice alla priorityqueue
        pqueue.add(new Node(src_vertex, 0));

        // partenza impostata a 0
        dist[src_vertex] = 0;
        while (visited.size() != V) {

            // u viene rimossa poichè ha la minima distanza
            int u = pqueue.remove().node;

            // nodo per finalizzare la list
            visited.add(u);
            graph_adjacentNodes(u);
        }
    }
    //  metodo per il processo dei nodi vicini a quelli già visitati
    private void graph_adjacentNodes(int u)   {
        int edgeDistance = -1;
        int newDistance = -1;

        // tutti i processi vicino al nodo u
        for (int i = 0; i < adj_list.get(u).size(); i++) {
            Node v = adj_list.get(u).get(i);

            //  procede solo se in nodo corrente non è stato visitato
            if (!visited.contains(v.node)) {
                edgeDistance = v.cost;
                newDistance = dist[u] + edgeDistance;

                // compara le distanze
                if (newDistance < dist[v.node])
                    dist[v.node] = newDistance;

                // aggiunge il vertice corrente alla priorityqueue
                pqueue.add(new Node(v.node, dist[v.node]));
            }
        }
    }
}