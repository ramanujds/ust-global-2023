package stack;

public class Stack {
	
	private int maxSize;
	private int[] stackArray;
	private int top;
	
	
	public Stack(int size) {
		
		this.maxSize=size;
		this.stackArray=new int[maxSize];
		top=-1;
	
	}
	
	
	public void push(int item) {
		if(isFull()) {
			System.out.println("Stack is Full");
			return;
		}
		top++;
		stackArray[top]=item;
		System.out.println("Pushed "+item);
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return 0;
		}
		int oldTop=top;
		top--;
		System.out.println("Popped "+stackArray[oldTop]);
		return stackArray[oldTop];
	}
	
	public int peak() {
		return stackArray[top];
	}
	
	public boolean isEmpty() {
		return top==-1;
	}
	
	
	public boolean isFull() {
		return top==maxSize-1;
	}
	

}
