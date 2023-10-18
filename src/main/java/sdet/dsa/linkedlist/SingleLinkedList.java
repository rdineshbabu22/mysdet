package sdet.dsa.linkedlist;

import org.junit.Test;

public class SingleLinkedList {
	Node head;
	Node tail;
	
	public class Node{
		
		int data;
		Node next;
		
		Node (int key){
			this.data=key;
			next=null;
		}
			
	}
	
	public Node addNode(int data) {
		Node node =new Node(data);
		return node;
		// or 
		// return new Node (data);	
	}
	
	@Test
	public void addNode() {
		if(head == null && tail==null) {
			head=addNode(5);
			tail=head.next;
		}
		else {
			tail.next=addNode(10);
		}
	
		System.out.println("Vaue of Head is --> "+head +"Value of Head  is-->"+head.data +"Value of tail is -->"+tail+"Value of tail next is-->"+tail.next);
	}
	

}
