package com.Registration;

import java.util.*;

public class Main {
	public static void main(String hh[])
	{	
		Login l1 = new Login();
		System.out.println(" ************************************************ ");
		System.out.println(" ||   Welcome to Pharmacy Management System    || ");
		System.out.println(" ************************************************ ");
		Scanner sc = new Scanner(System.in);
		char ch;	       
		do{
			System.out.println(" ************************************************");
			System.out.println(" || 1. Login            ||    2.Signup         || ");

			System.out.println(" ************************************************");
			
			System.out.println("Enter your choice");
			
			switch(sc.nextInt()) //take input from user.
			{
				case 1 : l1.login();
						break;

				case 2 : l1.signup();
						break;
			
				default : System.out.println("Enter valid choice");
			}
		System.out.println("Do you want to continue..");
		ch = sc.next().charAt(0);
		}
		while( (ch == 'y') || (ch =='Y') );

	}
}
