package PathSumII;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
               5
              / \
             4   8
            /   / \
           11  13  4
          /  \      \
         7    2      5
        */

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);

        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);

        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(5);

        Solution solution = new Solution();

        int targetSum = 22;

        List<List<Integer>> result = solution.pathSum(root, targetSum);
        System.out.println(result);
    }
}
