package defaultandstatic;

interface Printable{
	void print();
	default void scan() {
		System.out.println("Default Scanning..");
	}
	
	static void show() {
		System.out.println("Hello world");
	}
	
}

class Printer implements Printable{
	
	public void print() {
		System.out.println("Hello");
	}
	
	public void scan() {
		System.out.println("I can scan..");
	}
}

public class DefaultAndStaticDemo {

	public static void main(String[] args) {
		Printer p= new Printer();
		p.print();
		p.scan();
		
		Printable.show();
		
	}
	
}
