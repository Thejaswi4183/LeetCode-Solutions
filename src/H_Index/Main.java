package H_Index;

public class Main {
    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};

        Solution sol = new Solution();
        int result = sol.hIndex(citations);

        System.out.println(result);
    }
}