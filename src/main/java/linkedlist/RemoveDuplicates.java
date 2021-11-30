package linkedlist;

import util.structures.LinkedListNode;

import java.util.HashSet;

public class RemoveDuplicates {
    LinkedListNode list = null;

    RemoveDuplicates (LinkedListNode newList){
        list = newList;
    }

    public LinkedListNode main(){
        LinkedListNode previous = null;
        LinkedListNode current = list;
        HashSet<Integer> temp = new HashSet<>();
        while(current.next!=null){
            if(temp.contains(current.data)){
                previous.next = current.next;
            }else{
                temp.add(current.data);
                previous = current;
            }
            current = previous.next;
        }
        return current;
    }
}
