package queue;

public class MainClass {
	
	public static void main(String[] args) {
		
		Queue queue=new Queue(5);
		
		queue.insert(10);
		queue.insert(17);
		queue.insert(13);
		queue.insert(25);
		queue.insert(32);
		queue.insert(100);
		queue.insert(200);
		
		
			System.out.println(queue.remove());
			System.out.println(queue.remove());
			System.out.println(queue.remove());
			System.out.println(queue.remove());
			System.out.println(queue.remove());
		
		
		
		
	}

}
