package linkedlist;

import util.structures.LinkedListNode;

public class Loop {
    public LinkedListNode head = null;

    public Loop(LinkedListNode node){
        this.head = node;
    }


    public LinkedListNode getLoopIntersection(){
        // Create slow runner fast runner
        LinkedListNode fast = head;
        LinkedListNode slow = head;
        // Detect slow and fast collision
        while(fast != null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast==slow){
                break;
            }
        }
        // On collision move slow to head
        slow = head;
        // Move slow and fast with +1 until collision
        while(fast!=slow){
            fast = fast.next;
            slow = slow.next;
        }
        // Return the collision node
        return slow;
    }
}
