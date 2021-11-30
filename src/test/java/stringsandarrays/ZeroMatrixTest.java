package stringsandarrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;
class ZeroMatrixTest {
    int[][] resultArray = {{0,18,0,4},{0,0,0,0},{0,0,0,0},{0,18,0,4}};

    @Test
    @DisplayName("Should find rows and cols with 0")
    void shouldFindZeros(){
        ZeroMatrix zeroMatrix = new ZeroMatrix();
        zeroMatrix.findZeros();
        HashSet<Integer> resRows = new HashSet<>(Arrays.asList(1,2));
        HashSet<Integer> resCols = new HashSet<>(Arrays.asList(0,2));
        assertEquals(zeroMatrix.rwz, resRows);
        assertEquals(zeroMatrix.cwz, resCols);
    }

    @Test
    @DisplayName("Should replace rows with 0")
    void replaceWithZerosTest(){
        ZeroMatrix zeroMatrix = new ZeroMatrix();
        int[][] res = zeroMatrix.main();
        assertEquals(Arrays.deepToString(resultArray), Arrays.deepToString(res));

    }

}