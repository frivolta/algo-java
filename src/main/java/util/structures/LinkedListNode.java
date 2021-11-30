package util.structures;

import java.util.HashSet;

public class LinkedListNode {
    public LinkedListNode next;
    public LinkedListNode prev;
    public LinkedListNode last;
    public int data;
    public LinkedListNode(int d, LinkedListNode n, LinkedListNode p) {
        data = d;
        setNext(n);
        setPrevious(p);
    }

    public LinkedListNode(int d) {
        data = d;
    }

    public LinkedListNode() { }


    public void setNext(LinkedListNode n) {
        next = n;
        if (this == last) {
            last = n;
        }
        if (n != null && n.prev != this) {
            n.setPrevious(this);
        }
    }

    public void setPrevious(LinkedListNode p) {
        prev = p;
        if (p != null && p.next != this) {
            p.setNext(this);
        }
    }

    public String printForward() {
        if (next != null) {
            return data + "->" + next.printForward();
        } else {
            return ((Integer) data).toString();
        }
    }

    public static void printList(LinkedListNode head)
    {
        LinkedListNode ptr = head;
        while (ptr != null)
        {
            System.out.print(ptr.data + " —> ");
            ptr = ptr.next;
        }

        System.out.println("null");
    }

    public LinkedListNode clone() {
        LinkedListNode next2 = null;
        if (next != null) {
            next2 = next.clone();
        }
        LinkedListNode head2 = new LinkedListNode(data, next2, null);
        return head2;
    }

    // Get last node
    public int getLastNode(){
        LinkedListNode currentList = this;
        while(currentList.next!=null){
            currentList = currentList.next;
        }
        System.out.println(currentList.data);
        return currentList.data;
    }


}
