package phoneandsim;

public interface Sim {
	
	String name="Sim"; // final by default
	
	void call(); // public and abstract by default
	
	public abstract void sendSms();
	
	void browse() ;

}
