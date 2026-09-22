package CanPlaceFlowers;

public class Main {
    public static void main(String[] args) {
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 1;

        Solution solution = new Solution();
        boolean result = solution.canPlaceFlowers(flowerbed, n);

        System.out.println(result);
    }
}

