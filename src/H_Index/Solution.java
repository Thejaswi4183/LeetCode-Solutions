package H_Index;

// import java.util.Arrays;

class Solution {

    // Bucket Counting Approach (Optimal)
    // Time Complexity: O(n), Space Complexity: O(n)
    public int hIndex(int[] citations) {

        int n = citations.length;
        int[] count = new int[n + 1];

        for (int c : citations) {
            count[Math.min(c, n)]++;
        }

        int papers = 0;
        for (int h = n; h >= 0; h--) {
            papers += count[h];
            if (papers >= h) {
                return h;
            }
        }

        return 0;
    }

    /*
    Sorting Approach (Reference)
    Time Complexity: O(n log n), Space Complexity: O(1)

    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;

        for (int i = 0; i < n; i++) {
            int papers = n - i;
            if (citations[i] >= papers) {
                return papers;
            }
        }

        return 0;
    }
    */
}