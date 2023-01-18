import java.util.ArrayList;


public class Main{

    public static void main(String[] args) {
        int routerWidth = 3;
        int routerHeight = 2;
        int[] routerPorts = new int[5];
        int[] routerDstPorts = new int[5];
        ArrayList routingTableEntries = new ArrayList();

    public static ArrayList<RoutingTableEntry>createRoutingTable(ArrayList<RoutingTableEntry>routingTableEntries, int[] routerSrcPorts, int[] routerDstPorts, int routerCount, int clientCount) {
        routingTableEntries = new ArrayList();

        for(int i = 0; i < 5; ++i) {
            if (routerDstPorts[i] != 0 && routerDstPorts[i] >= 40000) {
                int routerNum = 0;
                if (i == 0) {
                    routerNum = routerCount - 1;
                } else if (i == 1) {
                    routerNum = routerCount - routerWidth;
                } else if (i == 2) {
                    routerNum = routerCount + 1;
                } else if (i == 3) {
                    routerNum = routerCount + routerWidth;
                }

                routingTableEntries.add(new RoutingTableEntry("R" + routerNum, routerSrcPorts[i], routerDstPorts[i]));
            } else if (routerDstPorts[i] >= 2000 && routerDstPorts[i] < 2005) {
                routingTableEntries.add(new RoutingTableEntry("c" + clientCount, routerSrcPorts[i], routerDstPorts[i]));
            } else if (routerDstPorts[i] == 3000) {
                routingTableEntries.add(new RoutingTableEntry("CNT", routerSrcPorts[i], routerDstPorts[i]));
            } else if (routerDstPorts[i] == 0) {
                routingTableEntries.add(new RoutingTableEntry("0", routerSrcPorts[i], routerDstPorts[i]));
            }
        }

        return routingTableEntries;
    }
}