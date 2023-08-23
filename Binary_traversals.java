/*Binary Tree - In-order, Pre-order, Post-order Traversals
Write a program to insert nodes in a binary search tree and traverse it in all three types of traversals.
Sample Input:

7

8 4 12 1 5 9 13



Sample Output:

In-Order Traversal: 1 4 5 8 9 12 13

Pre-Order Traversal: 8 4 1 5 12 9 13

Post-Order Traversal: 1 5 4 9 13 12 8*/

import java.uitl.*;
class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    public TreeNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTreeTraversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        TreeNode root = null;

        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            root = insertNode(root, value);
        }

        System.out.print("In-Order Traversal: ");
        inOrderTraversal(root);
        System.out.println();

        System.out.print("Pre-Order Traversal: ");
        preOrderTraversal(root);
        System.out.println();

        System.out.print("Post-Order Traversal: ");
        postOrderTraversal(root);
        System.out.println();

        scanner.close();
    }

    public static TreeNode insertNode(TreeNode root, int value) {
        if (root == null) {
            return new TreeNode(value);
        }

        if (value < root.value) {
            root.left = insertNode(root.left, value);
        } else if (value > root.value) {
            root.right = insertNode(root.right, value);
        }

        return root;
    }

    public static void inOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        inOrderTraversal(root.left);
        System.out.print(root.value + " ");
        inOrderTraversal(root.right);
    }

    public static void preOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        System.out.print(root.value + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public static void postOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.value + " ");
    }
}
