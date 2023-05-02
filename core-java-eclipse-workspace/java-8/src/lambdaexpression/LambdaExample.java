package lambdaexpression;

interface Printable{
	void print();
}

//class Printer implements Printable{
//	
//	public void print() {
//		System.out.println("Hey Printer..");
//	}
//}

public class LambdaExample {

	public static void main(String[] args) {
		
//		Printable p = new Printable() {
//			public void print() {
//				System.out.println("Printing..");
//			}
//		};
		
		Printable p = () -> System.out.println("Printing..");
		
		
		p.print();
	}
	
}
