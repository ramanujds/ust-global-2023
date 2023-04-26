package singlylinkedlist;

public class MainClass {

	public static void main(String[] args) {
		
		SinglyLinkedList linkedList=new SinglyLinkedList();
		
		linkedList.insertFirst(10);
		linkedList.insertFirst(50);
		linkedList.insertFirst(100);
		linkedList.deleteFirst();
		linkedList.insertFirst(500);
		linkedList.insertLast(777);
		
		linkedList.displayList();
		
		

	}

}
