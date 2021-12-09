package linkedlist;

import util.structures.LinkedListNode;

public class Palindrome {
    public LinkedListNode head = null;
    public LinkedListNode firstHalf = null;
    public LinkedListNode secondHalf = null;

    public Palindrome(LinkedListNode head){
        this.head=head;
    }
    // [4,3,2,1,2,3,4]
    public void divideHalf(){
        LinkedListNode slow = head;
        LinkedListNode fast = head;
        firstHalf = slow;
        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            if(fast.next!=null && fast.next.next!=null){
                slow = slow.next;
            }
        }

        // Skip middle point
        secondHalf = slow.next.next;
        slow.next = null;
    }

    public void reverseHalf(){
        LinkedListNode prev = null;
        LinkedListNode curr = firstHalf;
        LinkedListNode next = null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        firstHalf = prev;
    }

    public boolean isPalindrome(){
        boolean isPalindrome = false;
        while(firstHalf!=null || secondHalf!=null){
            isPalindrome = firstHalf.data == secondHalf.data;
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return  isPalindrome;
    }

    public boolean main(){
        divideHalf();
        reverseHalf();
        return isPalindrome();
    }

}
