package MergeSortedArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] n1 = {1, 2, 3, 0, 0, 0};
        int m = 3;

        int[] n2 = {2, 5, 6};
        int n = 3;

        s.merge(n1, m, n2, n);

        System.out.println(Arrays.toString(n1));
    }
}
