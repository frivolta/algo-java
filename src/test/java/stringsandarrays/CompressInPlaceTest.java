package stringsandarrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import stringsandarrays.CompressInPlace;

import static org.junit.jupiter.api.Assertions.*;

class CompressInPlaceTest {
    CompressInPlace compressInPlace = new CompressInPlace();

    @Test
    @DisplayName("Should compress a string correctly")
    void compressStringTest(){
        assertEquals("a2b1c5a3", compressInPlace.compressString("aabcccccaaa"));
    }
}