package com.DoctorAppointment;

import java.util.Scanner;

import com.Registration.Login;

public class LinkedListDemo {
	Node head; // pointer

	void printList() {
		if (head == null)
			System.out.println("List is empty");
		else {
			int sr = 1;
			Node n = head;
			System.out.println(
					"******************************************************************************************************");
			System.out.print("Sr no. " + "||" + "     Patient Name    " + "||" + "      Doctor Name    " + "||"
					+ "              Date       \n");
			System.out.println(
					"***************************************************************************************************");
			while (n != null) {
				System.out.print("||" +sr + "    "+"||"+ n.getPatientName() + "                 "+"||" + n.getDrName()
						+ "                      "+"||" + n.getDate() + "||"+" \n");
				System.out.println(
						"**************************************************************************************************");
				n = n.next;
				sr++;
			}
			System.out.println("");
		}

	}

	void insertEnd(Node newNode) {
		if (head == null)
			head = newNode;
		else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

	void deleteMid(String name) {
		Node temp = head;
		Node last;
		if (head == null)
			System.out.println("list is empty");
		if (head.getPatientName().equals(name)) {

			head = head.next;
			if (head == null)
				last = null;
			System.out.println("Data deleted successfully..");
		} else {

			while (temp.next != null) {
				if (temp.next.getPatientName().equals(name)) 
				{
					temp.next = temp.next.next;
					System.out.println("Data deleted successfully..");
					return;
				}
				temp = temp.next;
			}

			if (temp.next == null)
				System.out.println("Patient name not in list");

		}
	}

	void search(String name) {
		Node temp = head;
		Node last = null;

		if (head == null) {
			System.out.println("list is empty");
			return;
		}
		if (head.getPatientName().equals(name)) {
			System.out.println("---------------------------------------------------------------");
			System.out.println("|           #         Patient Details           #             |");
			System.out.println("---------------------------------------------------------------");
			System.out.println("| Patient Name :             |   "  + head.getPatientName()); 
			System.out.println("| Disease      :             |   "  + head.getDisease());
			System.out.println("| Dr. Name     :             |   "  + head.getDrName());
			System.out.println("| Date         :             |   "  + head.getDate());
			System.out.println("|--------------------------------------------------------------|");

			//head = head.next;
			if (head == null)
				last = null;

			return;
		} else {

			while (temp.next != null) {
				if (temp.next.getPatientName().equals(name)) {// temp.next = temp.next.next;
					System.out.println("Patient Name : " + temp.next.getPatientName());
					System.out.println("Disease : " + temp.next.getDisease());
					System.out.println("Dr. Name : " + temp.next.getDrName());

					System.out.println("Date : " + temp.next.getDate());
					System.out.println("____________");
					return;
				}
				temp = temp.next;
			}

			if (temp.next == null)
				System.out.println("Patient name not in list");

		}

	} // fun end

	void exit() {
		System.out.println("Do you want to continue with:");
		System.out.println("1.Main Menu");
		System.out.println("2.Exit.");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		switch (n) {
		case 1:
			Login l1 = new Login();
			l1.mainMenu();
			break;
		case 2: 
				System.out.println("Thank you...Stay Healthy..Stay safe.");
				System.exit(0);
		}
	}
}
