package util.structures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {
    BinaryTree tree;

    @BeforeEach
    void setup() {
        int[] values = {1, 3, 9, 18, 3, 7, 25, 4};
        tree = new BinaryTree();
        Arrays.stream(values).forEach(val -> tree.add(val));
    }

    @Test
    @DisplayName("It should add a node to the tree")
    void addTest() {
        tree.add(999);
        assertEquals(" -> 1 -> 3 -> 9 -> 7 -> 4 -> 18 -> 25 -> 999", tree.printTree());
    }

    @Test
    @DisplayName("Should contain node")
    void containsNodeTest() {
        assertFalse(tree.containsNode(999));
        tree.add(999);
        assertTrue(tree.containsNode(999));
    }

    @Test
    @DisplayName("Should contain node")
    void deleteNodeTest() {
        tree.add(999);
        tree.delete(3);
        assertTrue(tree.containsNode(999));
        assertFalse(tree.containsNode(3));
    }

}