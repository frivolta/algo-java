package linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import util.structures.LinkedListNode;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    LinkedListNode first = new LinkedListNode(0, null, null); //AssortedMethods.randomLinkedList(1000, 0, 2);
    LinkedListNode head = first;
    LinkedListNode second = first;

    @BeforeEach
    void setup() {
        for (int i = 1; i < 9; i++) {
            if(i<4) {
                second = new LinkedListNode(i, null, null);
            }else{
                second = new LinkedListNode(8-i, null, null);
            }
            first.setNext(second);
            second.setPrevious(first);
            first = second;
        }
        System.out.println(head.printForward());
    }

    @Test
    @DisplayName("Should print a linked list")
    void printALinkedListTest(){
        Palindrome palindromeList = new Palindrome(head);
        assertEquals("0->1->2->3->4->3->2->1->0", palindromeList.head.printForward());
    }
    @Test
    @DisplayName("Should print the first half of the linked list")
    void getHalvesTest(){
        Palindrome palindromeList = new Palindrome(head);
        palindromeList.divideHalf();
        System.out.println(palindromeList.secondHalf.printForward());
        assertEquals("0->1->2->3", palindromeList.firstHalf.printForward());
        assertEquals("3->2->1->0", palindromeList.secondHalf.printForward());
    }

    @Test
    @DisplayName("Should reverse a linked list")
    void reverseHalfTest(){
        Palindrome palindromeList = new Palindrome(head);
        palindromeList.divideHalf();
        palindromeList.reverseHalf();
        assertEquals("3->2->1->0", palindromeList.firstHalf.printForward());
    }

    @Test
    @DisplayName("Should check if palindrome")
    void isPalindromeTest(){
        Palindrome palindromeList = new Palindrome(head);
        palindromeList.divideHalf();
        palindromeList.reverseHalf();
        boolean isPalindrome = palindromeList.isPalindrome();
        assertTrue(isPalindrome);
    }
}