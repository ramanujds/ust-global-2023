package polymorphism;

public class CalculatorMain {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
//		var output = calc.add("UST", "Global");
		var output = calc.add(10.5F, 20.5F);
		
		System.out.println("Output : "+output);

	}

}
