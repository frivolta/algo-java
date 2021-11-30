package util.structures;

import linkedlist.RemoveNthElementFromEnd;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {
    LinkedListNode first = new LinkedListNode(0, null, null); //AssortedMethods.randomLinkedList(1000, 0, 2);
    LinkedListNode head = first;
    LinkedListNode second = first;

    @BeforeEach
    void setup() {
        for (int i = 1; i < 5; i++) {
            second = new LinkedListNode(i+10, null, null);
            first.setNext(second);
            second.setPrevious(first);
            first = second;
        }
    }

    @Test
    @DisplayName("Should remove an element from the linked list")
    void removeElementTest(){
        RemoveNthElementFromEnd list = new RemoveNthElementFromEnd(head, 4);
        assertEquals("0->12->13->14", list.removeElement().printForward());
    }

    @Test
    @DisplayName("Should remove middle nodes")
    void removeMiddleNodes(){
        RemoveNthElementFromEnd list = new RemoveNthElementFromEnd(head, 4);
        assertEquals("0->12->13->14", list.removeMiddle(14).printForward());
    }
}