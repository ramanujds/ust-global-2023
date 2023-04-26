package stack;

public class MainClass {

	public static void main(String[] args) {
		Stack stack=new Stack(5);
		
		stack.push(10);
		stack.push(15);
		stack.push(5);
		stack.push(20);
		stack.push(50);
		stack.push(30);
		
		while(!stack.isEmpty()) {
			stack.pop();
		}

	}

}

// rahul
// luhar
