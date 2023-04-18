package phoneandsim;

public class PhoneApp {

	public static void main(String[] args) {
		
		Phone myPhone = new Phone();
		AirtelSim airtel = new AirtelSim();
		Sim sim = new Sim();
		myPhone.insertSim(sim);
		myPhone.makeACall();

	}

}
