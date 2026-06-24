package ZigzagConversion;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "PAYPALISHIRING";
        int numRows = 3;
        String result = solution.convert(s, numRows);
        System.out.println(result);
    }
}