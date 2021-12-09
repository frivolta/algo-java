package recursion;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BaseRecursionTest {
    BaseRecursion recursion = new BaseRecursion();

    @Test
    @DisplayName("Should revere a string")
    void reverseStringTest(){
        assertEquals("ciao", recursion.reverseString("oaic"));
    }

    @Test
    @DisplayName("Palindrome ex kayak")
    void palindromeTest(){
        assertEquals(true, recursion.palindrome("kayak"));
    }

    @Test
    @DisplayName("Sum of natural numbers")
    void sumOfNaturalNumbersTest(){
        assertEquals(55, recursion.sumOfnaturalNumbers(10));
    }

    @Test
    @DisplayName("Should binary search a number")
    void binarySearchTest(){
        assertEquals(1, recursion.binarySearch(new int[] {5,6,7,8,9,10}, 0,5, 6));
    }

}