package linkedlist;

import util.structures.LinkedListNode;

public class PalindromeTwo {

    public LinkedListNode head = null;

    public PalindromeTwo(LinkedListNode head){
        this.head=head;
    }

    public LinkedListNode reverse(LinkedListNode node){
       if(node == null || node.next==null){
           return node;
       }
       LinkedListNode reversed = reverse(node.next);
       node.next.next = node;
       node.next=null;
       return reversed;
    }

    public boolean isPalindrome(LinkedListNode n1, LinkedListNode n2){
        if(n1 == null){
            return n2 == null ? true : false;
        }
        if(n1!=n2){
            return false;
        }
        return isPalindrome(n1.next, n2.next);
    }

}
