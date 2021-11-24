import jdk.jfr.Description;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermutationTest {
    Permutation permutation;

    @BeforeEach
    void setup() {
        permutation = new Permutation();
    }

    @Test
    @DisplayName("Check a permutation using sort permutation")
    void testPermutation(){
        assertEquals(true, permutation.sortPermutation("Filippo", "ilippoF"));
    }
}