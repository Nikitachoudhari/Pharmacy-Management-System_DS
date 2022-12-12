package com.Registration;
import java.util.*;
public class PassGenerator {
	static boolean isValid(String password) {
		// return true if and only if password:
		// 1. have at least eight characters.
		// 2. consists of only letters and digits.
		// 3. must contain at least two digits.
		if (password.length() < 6) {
			return false;
		} else {
			char c;
			int count = 1;
			for (int i = 0; i < password.length() - 1; i++) {
				c = password.charAt(i);
				if (!Character.isLetterOrDigit(c)) {
					return false;
				} else if (Character.isDigit(c)) {
					count++;
					if (count < 2) {
						return false;
					}
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a Password: ");
		String password = sc.next();

		if (isValid(password)) {
			System.out.println("Valid Password");
		} else {
			System.out.println("Invalid Password");
		}
	}

}
