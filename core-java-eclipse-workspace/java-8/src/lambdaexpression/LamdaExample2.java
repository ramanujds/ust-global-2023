package lambdaexpression;

interface Calculator {
	int calculate(int x, int y);
}

public class LamdaExample2 {

	public static void main(String[] args) {

		Calculator c1 = (x, y) -> x + y;
		Calculator c2 = (x, y) -> { return x - y; };

		int sum = c1.calculate(10, 20);

		System.out.println(sum);

		int difference = c2.calculate(20, 10);

		System.out.println(difference);

		// Write a lambda expression to find the largest between x and y

		Calculator c3 = (x, y) -> {
			if(x>y) {
				return x;
			}
			return y;
		};
		
		int largest = c3.calculate(10, 20);
		
		System.out.println("Largest = "+largest);

	}

}
