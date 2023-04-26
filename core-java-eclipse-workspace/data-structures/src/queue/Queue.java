package queue;

public class Queue {

	private int maxSize;
	private int[] queueArray;
	private int front;
	private int rear;
	private int nItems;
	
	
	public Queue(int size) {
		
		this.maxSize=size;
		this.queueArray=new int[maxSize];
		this.front = 0;
		this.rear = -1;
		this.nItems = 0;
		
	}
	
	public void insert(int item) {
//		if(isFull()) {
//			System.out.println("Queue is Full");
//			return;
//		}
		
		if(rear==maxSize-1) {
			rear=-1;
		}
		rear++;
		queueArray[rear]=item;
		nItems++;
	}
	
	
	public int remove() {
//		if(isEmpty()) {
//			System.out.println("Queue is Empty");
//			return 0;
//		}
		
		int temp=queueArray[front];
		front++;
		
		if(front==maxSize) {
			front=0;
		}
		
		nItems--;
		return temp;
	}
	
	public int peek() {
		return queueArray[front];
	}
	
	public boolean isEmpty() {
		return nItems==0;
	}
	
	public boolean isFull() {
		return nItems==maxSize;
	}
	
}
