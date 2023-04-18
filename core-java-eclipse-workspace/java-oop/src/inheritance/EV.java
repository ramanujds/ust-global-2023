package inheritance;

public class EV extends Car{

	double batteryCapacityAH;
	
//	public EV() {
//		System.out.println("EV Constructor");
//	}
	
	public EV(String model, String color, String regNo, double batteryCapacity) {
		
		super(model, color, regNo);
		this.batteryCapacityAH=batteryCapacity;
	
	}
	
	public EV(String model) {
		super(model);
		System.out.println("EV class constructor with Model " + model);
	}
	
	public void chargeBattery() {
		System.out.println("Charging battery..");
	}
	
	
	
//	public void start() {
//		super.start();
//		System.out.println("My EV strated");
//	}
	
	static void stop() {
		System.out.println("EV Stopped");
	}
	
	public void showCarInfo() {
		super.showCarInfo();
		System.out.println("Battery Capacity (AH) : "+batteryCapacityAH);
	}
	
	public void brake() {
		
	}

	@Override
	public String toString() {
		return "EV [batteryCapacityAH=" + batteryCapacityAH + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
