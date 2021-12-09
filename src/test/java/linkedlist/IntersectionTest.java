package linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import util.structures.LinkedListNode;

import static org.junit.jupiter.api.Assertions.*;

class IntersectionTest {
    LinkedListNode first = null;
    LinkedListNode second = null;
    LinkedListNode common = null;

    @BeforeEach
    void setup() {
        LinkedListNode common = new LinkedListNode(80, new LinkedListNode(90, new LinkedListNode(100)));
        this.common = common;
        first = new LinkedListNode(10, new LinkedListNode(20, new LinkedListNode(30, common)));
        second = new LinkedListNode(60, common);
    }

    @Test
    @DisplayName("Should create two llists intersecting")
    void intersectionTest(){
        Intersection intersection = new Intersection(first, second);
        System.out.println(intersection.first.printForward());
        System.out.println(intersection.second.printForward());
        assertEquals("10->20->30->80->90->100", intersection.first.printForward());
        assertEquals("60->80->90->100", intersection.second.printForward());
    }

    @Test
    @DisplayName("Should get a llist length")
    void getLengthTest(){
        Intersection intersection = new Intersection(first, second);
        assertEquals(6, intersection.getTailAndSize(intersection.first,1).size);
        assertEquals(4, intersection.getTailAndSize(intersection.second,1).size);
        System.out.println(intersection.first.printForward());
        System.out.println(intersection.second.printForward());
    }

    @Test
    @DisplayName("Should return true as lists are intersecting")
    void hasIntersectionTest(){
        Intersection intersection = new Intersection(first, second);
        assertTrue(intersection.hasIntersection(intersection.firstTailAndSize.tail, intersection.secondTailAndSize.tail));
    }

    @Test
    @DisplayName("Should get the intersecting node")
    void findIntersectionTest(){
        Intersection intersection = new Intersection(first, second);
        LinkedListNode result = intersection.findIntersection(intersection.first, intersection.firstTailAndSize.size, intersection.second, intersection.secondTailAndSize.size);
        assertEquals(result, common);
    }

}