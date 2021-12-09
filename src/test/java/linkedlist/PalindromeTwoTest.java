package linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import util.structures.LinkedListNode;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTwoTest {
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
        PalindromeTwo palindromeList = new PalindromeTwo(head);
        assertEquals("0->1->2->3->4->3->2->1->0", palindromeList.head.printForward());
    }

    @Test
    @DisplayName("Should reverse a linked list")
    void reverseTest(){
        PalindromeTwo palindromeList = new PalindromeTwo(head);
        palindromeList.reverse(palindromeList.head);
        assertEquals("3->2->1->0", palindromeList.reverse(palindromeList.head).printForward());
    }


}