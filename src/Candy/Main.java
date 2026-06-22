package Candy;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] ratings1 = {1, 0, 2};
        System.out.println(sol.candy(ratings1)); // 5

        int[] ratings2 = {1, 2, 2};
        System.out.println(sol.candy(ratings2)); // 4

        int[] ratings3 = {1};
        System.out.println(sol.candy(ratings3)); // 1
    }
}