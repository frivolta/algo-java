package stringsandarrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import stringsandarrays.Compress;

import static org.junit.jupiter.api.Assertions.*;

class CompressTest {
    Compress compress = new Compress();

    @Test
    @DisplayName("Should sort a string")
    void sortStringTest(){
        assertEquals("AAAaabbbcc", compress.sortString("bbbAAAaacc"));
    }

    @Test
    @DisplayName("Should hash a string with K letter and V times in string")
    void hashStringTest(){
        assertEquals("a5b1c5", compress.hashString("aabcccccaaa"));
    }

    @Test
    @DisplayName("Should compress aabcccccaaa into a2b1c5a3")
    void compressStringTest(){
        assertEquals("a5b1c5", compress.compressString("aabcccccaaa"));
    }
}