package tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import util.structures.BinaryTree;
import util.structures.TreeNode;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class IsBinarySearchTreeTest {
    BinaryTree tree;

    @BeforeEach
    void setup() {
        tree = new BinaryTree(new TreeNode(4));
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(5);
        tree.root.left.left = new TreeNode(1);
        tree.root.left.right = new TreeNode(3);
        System.out.println(tree.printTree());
    }


    @Test
    @DisplayName("Should return true for a binary search tree")
    void isBSTTest(){
        IsBinarySearchTree isBinarySearchTree = new IsBinarySearchTree();
        assertTrue(isBinarySearchTree.isBST(tree.root));
    }

}