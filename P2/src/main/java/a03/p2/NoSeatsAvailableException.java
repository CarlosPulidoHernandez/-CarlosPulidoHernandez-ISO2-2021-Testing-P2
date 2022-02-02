package a03.p2;

public class NoSeatsAvailableException extends Exception{
	public NoSeatsAvailableException (final String errorMessage) {
		super(errorMessage);
	}
}

