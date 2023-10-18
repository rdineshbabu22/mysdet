package sdet.dsa.linkedlist;

public class CorrectSingleLinkedList {
	SingleLLNode head;
	SingleLLNode tail;
	int size =0;
	
	public void addNewNode(int data) {
		SingleLLNode newnode = new SingleLLNode(data);
		if(head==null) {
			head=tail=newnode;
		}
		
		else {
			tail.next=newnode;
			tail=tail.next;
	
		}
		size++;
		System.out.println("Current Size of Node"+size);
	}
	
	public void displayList() {
		SingleLLNode temp =head;
		while(temp!=null) {
			System.out.println("Memory of Node-->"+temp+"Value of Node-->"+temp.data+"Reference of Node"+temp.next);
			temp=temp.next;
		}
	}
	
	public void removeNodeByPosition(int position) {
		SingleLLNode current=head,previous=null;
		for(int i=1;i<position;i++) {
			previous=current;
			current=current.next;
		}
		previous.next=current.next;
		size--;
		System.out.println("Current Size of Node"+size);
	}
	
	public void addNodeAtBeginningOnly(int data) {
		SingleLLNode newnode = new SingleLLNode(data);
		if(head==null) {
			head=tail=newnode;
		}
		
		else {
			newnode.next=head;
			head=newnode;
		}
		size++;
	}
	
	
	public void reverseList() {
		SingleLLNode previous=null,current=head;
		
	}
	

}
