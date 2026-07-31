package MinimumAbsoluteDifferenceInBST;

public class Main {

    public static void main(String[] args) {

        /*
              4
             / \
            2   6
           / \
          1   3
        */

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        Solution solution = new Solution();

        System.out.println(solution.getMinimumDifference(root));
    }
}
