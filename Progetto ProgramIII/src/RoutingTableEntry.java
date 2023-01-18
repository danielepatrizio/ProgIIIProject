import java.util.Random;

public class RoutingTableEntry {
    private String entry;
    private int receivingPort;
    private int portToSendWith;
    private int linkLatency;
    private Random latencyGenerator;

    RoutingTableEntry(String entry, int receivingPort, int portToSendWith) {
        this.entry = entry;
        this.portToSendWith = portToSendWith;
        this.receivingPort = receivingPort;
        this.linkLatency = 0;
        if (entry.contains("R")) {
            this.latencyGenerator = new Random();
            this.linkLatency = this.latencyGenerator.nextInt(10) + 1;
            ++this.linkLatency;
        }

    }

    public int getLinkLatency() {
        return this.linkLatency;
    }

    public String getEntry() {
        return this.entry;
    }

    public int getReceivingPort() {
        return this.receivingPort;
    }

    public int getPortToSendWith() {
        return this.portToSendWith;
    }
}