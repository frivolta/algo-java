package linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import util.structures.LinkedListNode;

import java.util.Random;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class SortMiddleTest {
    LinkedListNode first = new LinkedListNode(7, null, null); //AssortedMethods.randomLinkedList(1000, 0, 2);
    LinkedListNode head = first;
    LinkedListNode second = first;

    @BeforeEach
    void setup() {
        Random rnd = new Random();
        for (int i = 1; i < 5; i++) {
            second = new LinkedListNode(rnd.nextInt(15), null, null);
            first.setNext(second);
            second.setPrevious(first);
            first = second;
        }
    }

    @Test
    @DisplayName("Should split elements right / left based on partition value")
    void sortListTest(){
        SortMiddle list = new SortMiddle(head, 7);
        System.out.println(list.head.printForward());
        LinkedListNode rest = list.sortByPartition();
        System.out.println(rest.printForward());
    }
}