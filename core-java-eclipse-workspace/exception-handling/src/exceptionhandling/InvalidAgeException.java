package exceptionhandling;

public class InvalidAgeException extends RuntimeException {

	private static final long serialVersionUID = 6716744213823964892L;

	public InvalidAgeException(String message) {
		super(message);
	}
	
}
