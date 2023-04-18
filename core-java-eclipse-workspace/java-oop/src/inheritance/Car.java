package inheritance;

public abstract class Car {
	 private String model;
	 private String color;
	 private String regNo;
	
//	 public Car() {
//		System.out.println("Car class constructor");
//	}
	 
	 
	 
	public Car(String model) {
		System.out.println("Car class constructor with Model " + model);
	}
	
	public Car(String model, String color, String regNo) {
	this.model = model;
	this.color = color;
	this.regNo = regNo;
}

	public final void start() {
		System.out.println("Car strated");
	}
	
	public abstract void brake();
	
	public void showCarInfo() {
		System.out.println("Model : "+model);
		System.out.println("Color : "+color);
		System.out.println("Rg No : "+regNo);
	}
	
	static void stop() {
		System.out.println("Car Stopped");
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", color=" + color + ", regNo=" + regNo + "]";
	}
	
	

}
