package sdet.dsa.linkedlist;

public class DoubleLinkedList {

	DoubleLLNode head;
	DoubleLLNode tail;
	int size = 0;

	public void addFirst(int data) {
		DoubleLLNode newnode = new DoubleLLNode(data);

		if (head == null) {
			head = tail = newnode;

		} else {
			newnode.next = head;
			head.previous = newnode;
			head = newnode;
		}
		size++;
	}

	public void addLast(int data) {
		DoubleLLNode newnode = new DoubleLLNode(data);
		if (tail == null) {
			head = tail = newnode;

		}

		else {
			newnode.previous = tail;
			tail.next = newnode;
			tail = newnode;

		}
		size--;
	}
	
	public void removeFirst() {
		head=head.next;
		head.previous=null;

		
	}
	
public void removeLast() {
	tail=tail.previous;
	tail.next=null;
	}

public void printNodeHeadToTail() {
	System.out.println("Print linked list from Head to tail");
	DoubleLLNode temp=head;
	while(temp!=null) {
		System.out.println("Current node previous reference -->"+temp.previous+"Current node Address-->"+temp+" Current node value-->"+temp.data+" Current node next reference-->"+temp.next);
		temp=temp.next;
	}
}

public void printNodeTailToHead() {
	System.out.println("Print linked list from tail to head");
	DoubleLLNode temp=tail;
	while(temp!=null) {
		System.out.println("Current node previous reference -->"+temp.previous+"Current node Address-->"+temp+" Current node value-->"+temp.data+" Current node next reference-->"+temp.next);
		temp=temp.previous	;
	}
}

}
