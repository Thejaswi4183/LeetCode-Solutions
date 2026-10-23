package KeysAndRooms;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<List<Integer>> rooms = new ArrayList<>();
        rooms.add(List.of(1));
        rooms.add(List.of(2));
        rooms.add(List.of(3));
        rooms.add(List.of());

        Solution sol = new Solution();
        System.out.println(sol.canVisitAllRooms(rooms));
    }
}
