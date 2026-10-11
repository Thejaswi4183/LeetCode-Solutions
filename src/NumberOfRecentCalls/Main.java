package NumberOfRecentCalls;

public class Main {
    public static void main(String[] args) {
        RecentCounter counter = new RecentCounter();

        int[] timestamps = {1, 100, 3001, 3002};

        for (int timestamp : timestamps) {
            System.out.println(counter.ping(timestamp));
        }
    }
}
