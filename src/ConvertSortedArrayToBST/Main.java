package ConvertSortedArrayToBST;

public class Main {

    public static void main(String[] args) {

        int[] nums = {-10, -3, 0, 5, 9};

        Solution solution = new Solution();
        TreeNode root = solution.sortedArrayToBST(nums);

        System.out.print("Inorder: ");
        inorder(root);

        System.out.println();

        System.out.print("Preorder: ");
        preorder(root);
    }

    private static void inorder(TreeNode root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    private static void preorder(TreeNode root) {
        if (root == null) {
            return;
        }

        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }
}