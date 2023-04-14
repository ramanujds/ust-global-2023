class CarExample{
	public static void main(String []args){
		Car.noOfWheels=4;
		Car bmw = new Car("KL052828","BMW Series 3", "White");
		Car tata = new Car("KA05A7896","Tata Nexon","Black");
		

		System.out.println(bmw.color);
		
		System.out.println("For BMW Car");
		bmw.start();
		bmw.brake();
		bmw.printCarDetails();

		System.out.println("For TATA Car");
		tata.start();
		tata.brake();
		tata.printCarDetails();
	}
}
		