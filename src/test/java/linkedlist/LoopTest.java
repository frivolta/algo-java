package linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import util.structures.LinkedListNode;

import static org.junit.jupiter.api.Assertions.*;

class LoopTest {
    LinkedListNode head = null;
    LinkedListNode intersection = null;

    @BeforeEach
    void setup() {
        LinkedListNode intersectionNode = new LinkedListNode(10);
        this.intersection = intersectionNode;
        LinkedListNode loop = new LinkedListNode(80, new LinkedListNode(90, new LinkedListNode(100, intersectionNode)));
        intersectionNode.next = loop;
        LinkedListNode head = new LinkedListNode(1, new LinkedListNode(2, new LinkedListNode(3, intersectionNode)));
        this.head = head;
    }

    @Test
    @DisplayName("Should create a looped linked list")
    public void loopTest() {
        Loop loop = new Loop(this.head);
        assertEquals(head, loop.head);
    }

    @Test
    @DisplayName("Should get the intersection node")
    public void getLoopIntersectionTest() {
        Loop loop = new Loop(this.head);
        LinkedListNode collNode = loop.getLoopIntersection();
        assertEquals(collNode.data, intersection.data);
    }


}