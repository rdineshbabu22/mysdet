package sdet.dsa.linkedlist;

public class IntersectionOfTwoLinkedList {
	public SingleLLNode intersectionTwoLinkedList(SingleLLNode headA,SingleLLNode headB){
        SingleLLNode tempA = headA;
        SingleLLNode tempB = headB;
        while(tempA!=null){
          while(tempB!=null){
              if(tempA==tempB){
                return tempA;
              }
              tempB=tempB.next;
          }
          tempB=headB;
          tempA=tempA.next;
        }
        return null;
    }

}
