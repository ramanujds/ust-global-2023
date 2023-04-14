package polymorphism;

public class Calculator {

	public int add(int value1, int value2) {
		return value1+value2;
	}
	
	// Overloaded Method
	// Same method name but different set of arguments
	public float add(float value1, float value2) {
		return value1+value2;
	}
	
	// Overloaded Method
	public String add(String value1, String value2) {
		return value1+" "+value2;
	}
	
}
