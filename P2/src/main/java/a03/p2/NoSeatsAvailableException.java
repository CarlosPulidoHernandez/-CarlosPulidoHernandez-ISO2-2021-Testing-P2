package A03.P2;

public class NoSeatsAvailableException extends Exception{
	public NoSeatsAvailableException (final String errorMessage) {
		super(errorMessage);
	}
}

