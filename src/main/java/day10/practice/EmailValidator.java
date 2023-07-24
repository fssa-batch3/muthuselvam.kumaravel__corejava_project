package day10.practice;

import java.util.regex.Pattern;

import day10.solved.ValidationException;



 class Validator {
	private static final String EMAIL_PATTERN = "^[a-z]+[a-z0-9._-]*@[a-z]+\\.[a-z]{2,}$";

	public static boolean isValidEmail(String email) {
		return Pattern.matches(EMAIL_PATTERN, email);
	}

	public static void main(String[] args) {
		String[] emails = { "example@example.com", "invalid_email.com", "invalid_email@com", "invalid@ email.com",
				"invalid_email@domain", "Invalid_email@domain", "invalid_email@domain.", "invalid_email@dom-ain",
				"invalid_email@dom_ain" };

		for (String email : emails) {
			System.out.println(email + " is valid: " + isValidEmail(email));
		}
	}
}
 
 class Email {
		
		private String email;

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}


	}

	class TaskValidator {
		public static boolean validate(Email task) throws ValidationException {
			if (task == null)
				throw new ValidationException("Email is null");
			else if (task.getEmail() == null || "".equals(task.getEmail()))
				throw new ValidationException("Emaill address is empty");
				return true;
		}
	}

	public class EmailValidator {
		public static void main(String[] args) {
			Email task = new Email();
//			task.setName("Creating test case"); Commenting this so that exception is thrown
			
			try {
				TaskValidator.validate(task);
			} catch (ValidationException e) {
				e.printStackTrace();
			}
		}
	}
 