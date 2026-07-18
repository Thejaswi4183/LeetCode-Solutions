package CountCompleteTreeNodes;

public class Main {

    public static void main(String[] args) {

        /*
                1
              /   \
             2     3
            / \   /
           4   5 6

           Total nodes = 6
        */

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);

        Solution solution = new Solution();

        int count = solution.countNodes(root);

        System.out.println(count);
    }
}
