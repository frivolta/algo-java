package stringsandarrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RotateMatrixTest {
    RotateMatrix rotateMatrix = new RotateMatrix();

    @Test
    @DisplayName("Should return matrix")
    void returnMatrix() {
        assertEquals(1, rotateMatrix.matrix[0][1]);
    }

    @Test
    @DisplayName("Should invert columns to rows")
    void switchColumnRows() {
        int[][] expected = {{6,3,0}, {7,4,1}, {8,5,2}};
        assertEquals(Arrays.deepToString(expected),Arrays.deepToString(rotateMatrix.main()));
    }

}