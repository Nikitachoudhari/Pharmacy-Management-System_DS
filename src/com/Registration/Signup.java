package com.Registration;

import java.util.*;

public class Signup {
	
	private String name;
	private long mobNo;
	private String email;
	private String pass;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobNo() {
		return mobNo;
	}

	public void setMobNo(long mobNo) {
		this.mobNo = mobNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	boolean isStrong(String pass) {
		// return true if and only if password: 
		// 1. have at least six characters
		// 2. it contains Symbol.
		// 3. must contain at least one digit.

		if (pass.length() < 7) {
			System.out.println("Passward must contain at least 6 character.");

			return false;
		} else {
			char c;
			int count = 1;
			for (int i = 0; i < pass.length() - 1; i++) {
				c = pass.charAt(i);
				if (!Character.isLetterOrDigit(c)) {    
					return false;
				} else if (Character.isDigit(c)) {
					count++;
					if (count < 2) {
						return false;
					}
				} else {
					String specialChars = "/*!@#$%^&*()\"{}_[]|\\?/<>,.";
					if (specialChars.contains(pass.substring(i, 1)))
						return true;
					// theCount++;
				}

			}

		}
		return true;
	}

	void signup() {                    //call while doing signup operation 

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name : ");
		name = sc.next();

		System.out.print("Enter mobile Number : ");    //apply some validaitons here 
		mobNo = sc.nextLong();

		System.out.print("Enter Email : ");           // apply validations 
		email = sc.next();

		System.out.print("Enter passward : ");
		pass = sc.next();

		if (isStrong(pass)) {
			System.out.println("Strong Password");
		} else {
			System.out.println("Not Strong Password");
			do {
				System.out.print("Enter passward : ");
				pass = sc.next();
			} while (isStrong(pass) != true);
		}
	}	
	
}
		 
		
 