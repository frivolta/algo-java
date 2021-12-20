package tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import util.structures.BinaryTree;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CheckBinaryTreeTest {
    BinaryTree tree;

    @BeforeEach
    void setup() {
        int[] values = {18,3,1,9,42,25,86};
        tree = new BinaryTree();
        Arrays.stream(values).forEach(val -> tree.add(val));
    }

    @Test
    @DisplayName("Should return true if is balanced")
    void isBalancedTest(){
        CheckBinaryTree checkBinaryTree = new CheckBinaryTree();
        boolean result = checkBinaryTree.isBalanced(tree.root);
        assertTrue(result);
    }



}