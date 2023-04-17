package inheritance;

public class Car {
	 protected String model;
	 protected String color;
	 protected String regNo;
	
	public void start() {
		System.out.println("Car strated");
	}
	
	public void brake() {
		System.out.println("Brakes Applied");
	}
	
	public void showCarInfo() {
		System.out.println("Model : "+model);
		System.out.println("Color : "+color);
		System.out.println("Rg No : "+regNo);
	}

}
