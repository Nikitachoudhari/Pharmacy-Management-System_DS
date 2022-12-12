package com.MedicineOrder;

import java.util.Scanner;

public class Pharmacy {
	public Pharmacy() {
		Medicine medicine = new Medicine();
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("\t\t***************************************************");
			System.out.println("\t\t\t  #  Pharmacy Management System  #\n");
			System.out.println("\t\t==================================================\n\n");
			System.out.println("\t\t--------------------------------------------------\n");
			System.out.println("\t\t||\t1. New Medicine order \t\t ||\n");
			System.out.println("\t\t||\t2. Delete latest Medicine order\t\t ||\n");
			System.out.println("\t\t||\t3. Modify Order List \t\t\t ||\n");
			System.out.println("\t\t||\t4. Print the Receipt and Make Payment \t ||\n");
			System.out.println("\t\t||\t5. Daily Summary    \t \t\t ||\n");
			System.out.println("\t\t||\t6. Return back to main menu\t\t ||\n");
			System.out.println("\t\t--------------------------------------------------\n");
			System.out.println("Enter choice: ");

			choice = sc.nextInt();

			switch (choice) {
			case 1:
				medicine.take_order();
				break;

			case 2:
				medicine.delete_order();
				break;

			case 3:
				medicine.modify();
				break;

			case 4:
				medicine.order_list();
				break;

			case 5:
				medicine.daily_summary();
				break;

			case 6:
				medicine.Mainmenu();
				break;

			default:
				System.out.println("You enter invalid input \n re-enter the input");
				break;

			} // end Switch
		} while (choice != 6);// end do

	}// main end

}
