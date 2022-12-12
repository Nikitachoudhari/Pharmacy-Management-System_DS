package com.Registration;

import com.DoctorAppointment.*;
import com.MedicineOrder.*;
import java.util.*;

public class Login extends Signup {                   //inheritance used 

	Scanner sc = new Scanner(System.in);

	void login() {
		System.out.print("Username : ");
		if ( getName().equals(sc.next()) ) //It takes input from user.
		{ 
			int count = 0, flag = 0;
			String p1 = getPass();
			String p2;

			do {
				System.out.print("Passward : ");
				p2 = sc.next();
				boolean m = p1.equals(p2);

				if (m == false) {
					System.out.println("Invalid passward!..try again");
					count++;
				} else {
					flag = 1;
					break;
				}
			} while (count < 3);

			if (flag == 1) {
				System.out.println("You are logned in..Successfully");
				mainMenu();
			}

			else
				System.out.println("reach max limit");
		} 
		else {
			System.out.println("Wrong username try again.. ");
			login();
		}

	}

	public void mainMenu() {
		System.out.println("*****************************************************");
		System.out.println("||          Please enter your choice:             ||");
		System.out.println("*****************************************************");
		System.out.println("=====================================================");
		System.out.println("| 1. Dr.Appointment | 2. Medicine order. |  3.Exit   |");
		System.out.println("=====================================================");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		switch (i) {
		case 1:
			Doctor dr = new Doctor();
			break;
		case 2:
			Pharmacy ph = new Pharmacy();
			break;
		case 3:
			System.exit(0);

		}

	}

}
