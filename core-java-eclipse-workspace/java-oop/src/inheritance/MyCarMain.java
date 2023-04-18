package inheritance;

public class MyCarMain {

	public static void main(String[] args) {
		
		Car myCar = new EV("Mercedes Benz","White","KL-052989",650);
		

//		myCar.start();
//		myCar.showCarInfo();
//		myCar.stop();
	//	myCar.chargeBattery();
		
		System.out.println(myCar instanceof EV);
		System.out.println(myCar instanceof Car);
		System.out.println(myCar instanceof Object);
		System.out.println(myCar instanceof FuelEngine);
		

	}

}
