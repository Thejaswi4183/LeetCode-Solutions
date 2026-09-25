package StringCompression;

public class Main {
    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        Solution solution = new Solution();
        int length = solution.compress(chars);
        System.out.println(length);
    }
}

