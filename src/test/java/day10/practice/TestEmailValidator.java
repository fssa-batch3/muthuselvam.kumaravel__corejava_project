package day10.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import day10.practice.*;
 class TestEmailValidator {
	
	@Test
	void testEmail() {
		
		String email = "arun@gmail.com";
		
		try {
			assertTrue(new EmailValidator().isValidEmail(email));
		} catch (InvalidEmailException e) {
			e.printStackTrace();
		}
	}

}