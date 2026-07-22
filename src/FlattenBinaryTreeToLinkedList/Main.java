package FlattenBinaryTreeToLinkedList;

public class Main {

    public static void main(String[] args) {

        // Input: [1,2,5,3,4,null,6]

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);

        root.right.right = new TreeNode(6);

        Solution solution = new Solution();
        solution.flatten(root);

        System.out.print("[");
        TreeNode curr = root;
        while (curr != null) {
            System.out.print(curr.val);

            if (curr.right != null) {
                System.out.print(", null, ");
            }

            curr = curr.right;
        }

        System.out.println("]");
    }
}