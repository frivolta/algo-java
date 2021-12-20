package tree;

import util.structures.TreeNode;

public class IsBinarySearchTree {

    public boolean isBST(TreeNode root) {
        return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBSTUtil(TreeNode node, int min, int max) {
        if (node == null) {
            return true;
        }
        if (node.value < min || node.value > max) {
            return false;
        }

        return isBSTUtil(node.left, min, node.value - 1) && isBSTUtil(node.right, node.value + 1, max);
    }

}
