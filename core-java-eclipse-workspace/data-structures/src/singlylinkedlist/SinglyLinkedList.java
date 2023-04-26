package singlylinkedlist;

public class SinglyLinkedList {

	private Node first;
	private Node last;
	
	public SinglyLinkedList() {
		this.first=null;
		this.last=null;
	}
	
	public boolean isEmpty() {
		return first==null;
	}
	
	public void insertFirst(int data) {
		
		Node newNode= new Node();
		newNode.data=data;
		if(isEmpty()) {
			last=newNode;
		}
		newNode.next=first;
		first=newNode;
		
	}
	
	public Node deleteFirst() {
		Node temp=first;
		if(first.next==null) {
			last =null;
		}
		first=first.next;
		return temp;
	}
	
	public void insertLast(int data) {
		
//		Node current=first;
//		while(current.next !=null) {
//			current=current.next;
//		}
		
		
		Node newNode= new Node();
		newNode.data=data;
		
		if(isEmpty()) {
			first=newNode;
		}
		else{
			last.next=newNode;
			last=newNode;
			
		}
		
		
		
	}
	
	public void displayList() {
		System.out.println("List -> ");

		Node current=first;
		do{
			current.displayNode();
			current=current.next;
		}while(current  !=null);
		System.out.println();
	}
	
}
