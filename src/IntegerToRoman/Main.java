package IntegerToRoman;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int num = 1994;

        String roman = solution.intToRoman(num);

        System.out.println("Roman numeral of " + num + " is: " + roman);
    }
}
