package heap;

public class MyHeap {

	public static void main(String[] args) {
		
		Heap myHeap=new Heap(10);
		
		myHeap.insert(10);
		myHeap.insert(29);
		myHeap.insert(20);
		myHeap.insert(22);
		myHeap.insert(25);
		
		
		myHeap.displayHeap();
		
//		      29
//		
//		25           20
//		
//	10      22
//		
//		
//		for(int i=0;i<myHeap.getSize();i++) {
//			System.out.println(myHeap.heapArray[i].getKey());
//		}
	}

}
