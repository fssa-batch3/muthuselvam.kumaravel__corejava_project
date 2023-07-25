package day10.practice;

public class UserAlreadyException extends Exception {

	private static final long serialVersionUID = 1L;

	public UserAlreadyException(String msg) {
		super(msg);
	}

	public UserAlreadyException(Throwable te) {
		super(te);
	}

	public UserAlreadyException(String msg, Throwable te) {
		super(msg, te);
	}

}