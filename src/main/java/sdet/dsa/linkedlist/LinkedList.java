package sdet.dsa.linkedlist;

public class LinkedList {

	SingleLLNode head, tail;

	public SingleLLNode addNode(int data) {
		SingleLLNode newNode = new SingleLLNode(data);
		return newNode;
	}

	public void add(int data) {
		if (head == null) {
			head = addNode(data);
			tail = addNode(data);
		} else {
			tail.next = addNode(data);
			tail = tail.next;
		}
	}
	
	public void remove (int index) {
		
	}
}
