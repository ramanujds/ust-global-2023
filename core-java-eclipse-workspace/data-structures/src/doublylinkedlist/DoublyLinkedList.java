package doublylinkedlist;



public class DoublyLinkedList {

	private Node first;
	private Node last;
	
	public DoublyLinkedList() {
		this.first=null;
		this.last=null;
	}
	
	public boolean isEmpty() {
		return first==null;
	}
	
	
	public void insertFirst(int data) {
		Node newNode=new Node();
		newNode.data=data;
		
		if(isEmpty()) {
			last=newNode;
		}
		else {
			first.previous=newNode;
		}
		newNode.next=first;
		this.first=newNode;
		
	}
	
	public void insertLast(int data) {
		
		Node newNode=new Node();
		newNode.data=data;
		
		if(isEmpty()) {
			first=newNode;
		}
		else {
			last.next=newNode;
			newNode.previous=last;
		}
		last=newNode;
		
	}
	
	// assume the list is non-empty
	public Node deleteFirst() {
		Node temp=new Node();
		if(first.next==null) {
			last=null;
		}
		else {
			first.next.previous=null;
		}
		first=first.next;
		
		return temp;
	}
	
	// assume the list is non-empty
	public Node deleteLast() {
		Node temp=new Node();
		if(first.next==null) {
			first=null;
		}
		else {
			last.previous.next=null;
		}
		last=last.previous;
		
		return temp;
	}
	
	public void displayListForward() {
		System.out.println("List -> ");

		Node current=first;
		do{
			current.displayNode();
			current=current.next;
		}while(current  !=null);
		
		System.out.println();
	}
	
	public void displayListBackward() {
		System.out.println("List -> ");

		Node current=last;
		do{
			current.displayNode();
			current=current.previous;
		}while(current  !=null);
		
		System.out.println();
	}
	
	
}
