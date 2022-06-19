package com.greatlearning.services;

import java.util.Random;

import com.greatlearning.module.Employee;

public class CredentialService {

	public char[] generatePassword() {
		
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacter = "!@#$%^&*()_=+-/?.<>";
		
		String value = capitalLetters + smallLetters + numbers + specialCharacter;
		
		Random random = new Random();
		
		char[] password = new char[8];
		
		for (int i=0; i<8 ; i++) {
			
			password[i] = value.charAt(random.nextInt(value.length()));
		}
		return password;
	}

	public String generateEmailAddress(String firstName, String lastName, String department) {
		return firstName.toLowerCase() +lastName + "@" + department + ".abc.com";
	}

	public void showCredentials (Employee employee, String email, char[] generatedPassword) {
		System.out.println("Dear " + employee.getFirstName() + " your generated credential are as follows");
		System.out.println("Email  ---> " + email);
		System.out.print("Password ---> 1" + "");
		System.out.print(generatedPassword);
	}
}
