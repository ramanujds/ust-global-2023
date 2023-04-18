package phoneandsim;

public class PhoneApp {

	public static void main(String[] args) {
		
		
		AirtelSim airtel = new AirtelSim();
		JioSim jio = new JioSim();
		
		
		Phone myPhone = new Phone();
		
		myPhone.insertSim(airtel);
		myPhone.makeACall();

	}

}
