package day10.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
import day10.solved.ValidationException;

class Email {
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}

public class EmailValidator {
	public static boolean validate(String email) throws InvalidEmailException {
		String regex = "^.*@.*\\..*$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);

		boolean isMatch = matcher.matches();

		if (!isMatch) {
			throw new InvalidEmailException(email + " is invalid");
		}

		return true;
	}

	public static void main(String[] args) throws InvalidEmailException {
		System.out.println("Enter Email");
		Scanner scan = new Scanner(System.in);
		String mail = scan.nextLine();

		try {
			EmailValidator.validate(mail);
		} catch (InvalidEmailException e) {
			e.printStackTrace();
		}

	}

}