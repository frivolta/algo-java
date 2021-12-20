package tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import util.structures.BinaryTree;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MinimalHeightTest {
    int[] values = {1, 3, 9, 18, 25, 42, 86};

    @Test
    @DisplayName("Should create a valid binary tree with minimal height")
    void createMinimalBSTTest(){
        MinimalHeight minimalHeight = new MinimalHeight(values);
        assertEquals(" -> 18 -> 3 -> 1 -> 9 -> 42 -> 25 -> 86", minimalHeight.tree.printTree());
    }


}