package tree;

import util.structures.TreeNode;

public class CheckBinaryTree {

    private int getHeight(TreeNode root) {
        if (root == null) return -1;

        int leftHeight = getHeight(root.left);
        if (leftHeight == Integer.MIN_VALUE) return Integer.MIN_VALUE;

        int rightHeight = getHeight(root.right);
        if (rightHeight == Integer.MIN_VALUE) return Integer.MIN_VALUE;

        int height = leftHeight - rightHeight;
        if (Math.abs(height) > 1) {
            return Integer.MIN_VALUE;
        } else {
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

    public boolean isBalanced(TreeNode root) {
        return getHeight(root) != Integer.MIN_VALUE;
    }


}
