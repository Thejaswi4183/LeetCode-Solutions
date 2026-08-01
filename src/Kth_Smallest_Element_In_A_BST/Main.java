package Kth_Smallest_Element_In_A_BST;

public class Main {

    public static void main(String[] args) {

        /*
                 5
                / \
               3   6
              / \
             2   4
            /
           1
        */

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.left.left.left = new TreeNode(1);

        Solution solution = new Solution();

        int k = 3;
        int result = solution.kthSmallest(root, k);

        System.out.println(result);
    }
}
