package day02.practice;


public class Logger {
	public  void debug (String msg) {
		System.out.println("DEBUG: " + msg);
	}
	public static void info (String msg) {

		System.out.println("INFO: " + msg);
	}
	
	public static void info (int num) {

		System.out.println("INFO NUM: " + num);
	}
	
	public static void error (String msg) {

		System.out.println("ERROR: " + msg);
	}
	
	public static void error (int num) {

		System.out.println("ERROR NUM: " + num);
	}
	
	public static void debug (int num) {

		System.out.println("DEBUG NUM: " + num);
	}
	
	public static void main(String[] args) {
		Logger log = new Logger();
		log.debug("Debbugging");
		info("Informating");
		error("erroring");
		debug(7);
		error(7);
		info(7);
		
	}
	
	// Similarly write overloaded methods for error and info.
}
