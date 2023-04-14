public class Car{
	static int noOfWheels;
	private String regNo;
	private String model;
	private String color;

	public Car(){
		System.out.println("Car object created");
	}

	public Car(String regNo, String model, String color){
		this.regNo = regNo;
		this.model = model;
		this.color = color;	
	}	
	
	public void brake(){
		System.out.println("Brakes Applied");
	}

	public static void start(){
		System.out.println("Car Started");
	}

	public void printCarDetails(){
		System.out.println("Model : "+model);
		System.out.println("Reg No : "+regNo);
		System.out.println("Color : "+color);
		System.out.println("No of wheels : "+noOfWheels);
	}
}