package linkedlist;

import util.structures.LinkedListNode;

public class RemoveNthElementFromEnd {
    static LinkedListNode list;
    static int kth = 0;

    public RemoveNthElementFromEnd(LinkedListNode l, int k){
        list=l;
        kth=k;
    }

    public static LinkedListNode removeElement(){
        LinkedListNode fast = list;
        LinkedListNode slow = list;

        // fast starts from kth
        for(int i=0; i<kth; i++){
            fast=fast.next;
        }

        while(fast.next!=null){
            slow = slow.next;
            fast=fast.next;
        }

        slow.next=slow.next.next;
        return list;
    }

    public static LinkedListNode removeMiddle(int d){
        LinkedListNode fast = list;
        LinkedListNode slow = null;
        while(fast.next!=null){
            if(fast.next.data == d){
                while(fast.next!=null){
                    fast = fast.next;
                }
            }
        }
        return list;
    }


}
