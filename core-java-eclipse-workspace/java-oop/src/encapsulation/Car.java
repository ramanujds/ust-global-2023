package encapsulation;

public class Car {
	private String model;
	private String color;
	private String regNo;
	
	public Car() {
	}
	
	public Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	public Car(String model) {
		this.model = model;
	}
	
	public Car(String model, String color, String regNo) {
		this.model = model;
		this.color = color;
		this.regNo = regNo;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public void start() {
		System.out.println("Car strated");
	}
	
	public void showCarInfo() {
		System.out.println("Model : "+model);
		System.out.println("Color : "+color);
		System.out.println("Rg No : "+regNo);
	}


	public String toString() {
		return "Car [model=" + model + ", color=" + color + ", regNo=" + regNo + "]";
	}
	
	

}
