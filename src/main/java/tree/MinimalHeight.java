package tree;

import util.structures.BinaryTree;
import util.structures.TreeNode;

public class MinimalHeight {
    BinaryTree tree = new BinaryTree();
    int[] list = {};

    public MinimalHeight(int[] list){
        this.list = list;
        this.tree = new BinaryTree(createMinimalBST(list, 0, list.length-1));
    }

    public TreeNode createMinimalBST(int[] list, int start, int end){
        if(start>end){
            return null;
        }
        int mid = (start+end)/2;
        TreeNode node = new TreeNode(list[mid]);
        node.left = createMinimalBST(list, start, mid-1);
        node.right = createMinimalBST(list, mid+1, end);
        return node;
    }

}
