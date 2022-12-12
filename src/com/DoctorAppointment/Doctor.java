package com.DoctorAppointment;

import java.util.LinkedList;
import java.util.Scanner;

public class Doctor {
	public Doctor() {
		LinkedListDemo l1 = new LinkedListDemo();
		Scanner sc = new Scanner(System.in);

		int n;
		char ch;
		System.out.println("*****************************************");
		System.out.println("||     #   Doctor Appointment  #         ||");
		System.out.println("*****************************************");
		do {
			System.out.println("*****************************************");
			System.out.println("||       Enter your choice :           ||");
			System.out.println("*****************************************");
			System.out.println("||  1. Add Patient                     ||");
			System.out.println("||  2. View Patients                   ||");
			System.out.println("||  3. Search Patient                  ||");
			System.out.println("||  4. Remove Patient                  ||");
			System.out.println("||  5. Return back to menu.            ||");
			System.out.println("||=====================================||");
			n = sc.nextInt();
			switch (n) {
			case 1:
				System.out.print("Patient Name : ");
				String patientName = sc.next();

				System.out.print("Disease : ");
				String disease = sc.next();

				System.out.print("Dr. Name : ");
				String drName = sc.next();

				System.out.print("Date : ");
				String date = sc.next();

				Node n1 = new Node(patientName, disease, drName, date);

				l1.insertEnd(n1);

				break;

			case 2:

				l1.printList();
				break;

			case 3:
				System.out.print("Enter Patient Name to search : ");
				l1.search(sc.next());
				break;

			case 4:
				System.out.print("Enter Patient Name to remove : ");
				l1.deleteMid(sc.next());
				break;
			case 5:
				l1.exit();
				break;
			default:
				System.out.println("Enter the valid choice");

			}
			System.out.println("Do you want to continue..");
			ch = sc.next().charAt(0);
		} while ((ch == 'y') || (ch == 'Y'));
	}
}
