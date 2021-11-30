package linkedlist;

import util.structures.LinkedListNode;

public class SortMiddle {
    static public LinkedListNode head = null;
    static private int middleValue;

    public SortMiddle(LinkedListNode n, int m){
        head = n;
        middleValue = m;
    }

    LinkedListNode sortByPartition(){
        LinkedListNode before = new LinkedListNode(0);
        LinkedListNode before_head = before;
        LinkedListNode after = new LinkedListNode(0);
        LinkedListNode after_head = after;
        while (head != null){
            if(head.data<middleValue){
                before.next = head;
                before = before.next;
            }else{
                after.next = head;
                after = after.next;
            }
            head = head.next;
        }
        after.next = null;
        before.next = after_head.next;
        return before_head.next;
    }

}
