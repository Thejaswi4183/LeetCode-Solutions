package BinarySearchTreeIterator;

public class Main {
    public static void main(String[] args) {

        // Construct the BST
        //
        //         7
        //       /   \
        //      3     15
        //           /  \
        //          9    20
        //
        TreeNode root = new TreeNode(7);
        root.left = new TreeNode(3);
        root.right = new TreeNode(15);
        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(20);

        BSTIterator iterator = new BSTIterator(root);

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
