package sdet.dsa.linkedlist;

import org.testng.annotations.Test;

public class RunnerClass {

//	@Test
//	public void TestSingleLinkedList1() {
//		CorrectSingleLinkedList linkedlist = new CorrectSingleLinkedList();
//		linkedlist.addNewNode(20);
//		linkedlist.addNewNode(40);
//		linkedlist.addNewNode(60);
//		linkedlist.addNewNode(80);
//		linkedlist.displayList();
//		linkedlist.removeNodeByPosition(2);
//		linkedlist.displayList();
//		System.out.println(linkedlist.size);
//	}
	
	@Test
	public void TestDobuleLinkedList1() {
		DoubleLinkedList doublelinkedlist = new DoubleLinkedList();
		doublelinkedlist.addFirst(20);
		doublelinkedlist.addFirst(10);
		doublelinkedlist.addLast(40);
		doublelinkedlist.addLast(50);
		doublelinkedlist.removeFirst();
		doublelinkedlist.removeLast();
		doublelinkedlist.printNodeHeadToTail();
		doublelinkedlist.printNodeTailToHead();
		
	}
	
}
