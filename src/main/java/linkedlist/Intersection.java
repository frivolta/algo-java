package linkedlist;

import util.structures.LinkedListNode;

public class Intersection {
    LinkedListNode first;
    TailAndSize firstTailAndSize;
    LinkedListNode second;
    TailAndSize secondTailAndSize;


    public Intersection(LinkedListNode first, LinkedListNode second) {
        this.first = first;
        this.second = second;
        firstTailAndSize = getTailAndSize(first, 1);
        secondTailAndSize = getTailAndSize(second, 1);
    }

    public TailAndSize getTailAndSize(LinkedListNode node, int length) {
        if (node == null || node.next == null) {
            return new TailAndSize(node, length);
        }
        return getTailAndSize(node.next, length + 1);
    }

    public boolean hasIntersection(LinkedListNode tail1, LinkedListNode tail2) {
        return tail1 == tail2;
    }

    public LinkedListNode findIntersection(LinkedListNode n1, int s1, LinkedListNode n2, int s2) {
        int firstPointer = s1 - s2 > 0 ? s1 - s2 : 0;
        int secondPointer = s2 - s1 > 0 ? s2 - s1 : 0;
        int counter = 0;
        while(n1!=null || n2!=null){
            if(n1 == n2){
                return n1;
            }
            if(firstPointer > counter){
                n1 = n1.next;
            }
            if(secondPointer>counter){
                n2 = n2.next;
            }
            if(firstPointer<=counter && secondPointer<=counter){
                n1 = n1.next;
                n2 = n2.next;
            }
            counter++;
        }
        throw new IllegalArgumentException("Invlaid lists");
    }


}
