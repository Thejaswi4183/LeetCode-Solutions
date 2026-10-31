package KokoEatingBananas;

public class Main {
    public static void main(String[] args) {
        int[] piles = {3, 6, 7, 11};
        int h = 8;

        Solution obj = new Solution();

        int result = obj.minEatingSpeed(piles, h);
        System.out.println(result);
    }
}
