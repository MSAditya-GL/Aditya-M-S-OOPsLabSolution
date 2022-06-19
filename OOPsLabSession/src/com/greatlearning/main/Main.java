package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.module.Employee;

import com.greatlearning.services.CredentialService;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Employee emp1 = new Employee("Aditya", "MS");
		CredentialService cs = new CredentialService();

		System.out.println("Please enter the department from the following ");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");

		int option = in.nextInt();
		if (option > 0) {
			switch (option) {
			case 1: {
				String email = cs.generateEmailAddress(emp1.getFirstName().toLowerCase(),
						emp1.getLastName().toLowerCase(), "tech");
				char[] generatedPassword = cs.generatePassword();
				cs.showCredentials(emp1, email, generatedPassword);
			}
				break;
			case 2: {
				String email = cs.generateEmailAddress(emp1.getFirstName().toLowerCase(),
						emp1.getLastName().toLowerCase(), "admin");
				char[] generatedPassword = cs.generatePassword();
				cs.showCredentials(emp1, email, generatedPassword);
			}
				break;
			case 3: {
				String email = cs.generateEmailAddress(emp1.getFirstName().toLowerCase(),
						emp1.getLastName().toLowerCase(), "hr");
				char[] generatedPassword = cs.generatePassword();
				cs.showCredentials(emp1, email, generatedPassword);
			}
				break;
			case 4: {
				String email = cs.generateEmailAddress(emp1.getFirstName().toLowerCase(),
						emp1.getLastName().toLowerCase(), "legal");
				char[] generatedPassword = cs.generatePassword();
				cs.showCredentials(emp1, email, generatedPassword);
			}
				break;
			}
		} else {
			System.out.println("Enter the Correct Option");
		}
		in.close();

	}

}
