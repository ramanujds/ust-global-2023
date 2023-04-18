package inheritance;

public class FuelEngine extends Car {

	 public FuelEngine(String model) {
		super(model);
		// TODO Auto-generated constructor stub
	}

	private double engine_cc;
	
	 public void refillFuel() {
		 System.out.println("Fuel refill done");
	 }
	 

	public void brake() {
		
	}
	
}
