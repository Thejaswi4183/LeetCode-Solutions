package NumberOf1Bits;

public class Main {

    public static void main(String[] args) {
        int n = 11;
        Solution sol = new Solution();
        int result = sol.hammingWeight(n);
        System.out.println(result);
    }
}