package com.MedicineOrder;

import java.util.Scanner;

import com.Registration.Login;

public class Medicine {
	Scanner sc = new Scanner(System.in);
	Node1 start_ptr = null;
	Node1 last = null;

	void take_order() {

		int i;
		int choice, quantity, price, None;

		System.out.println("\nAdd Order Details\n");
		System.out.println("_____________ \n\n");

		Node1 newNode = new Node1();

		System.out.println("*********************************************************************************\n");
		System.out.println("DRUGS ID" + "\tDRUGS TYPE" + "  \t\tDRUGS NAME" + "           DRUGS PRICE(RM)");
		System.out.println("*********************************************************************************\n");

		System.out.println("01" + "\t" + "\tOTC" + "\t" + "    Probiotics" + "			Rs 2.00");
		System.out.println("02" + "\t" + "\tOTC" + "\t" + "    Vitamin C(500mg)" + "		Rs 3.00");
		System.out.println("03" + "\t" + "\tOTC" + "\t" + "    Acid Free C(500mg)" + "		Rs 1.00");
		System.out.println("04" + "\t" + "\tOTC" + "\t" + "    Women'S Multivate" + "		Rs 4.00");
		System.out.println("05" + "\t" + "\tOTC" + "\t" + "    Marino Tablet" + "	 	Rs 1.00");
		System.out.println("06" + "\t" + "\tOTC" + "\t" + "    Maxi Cal Tablet" + " 		Rs 5.00");
		System.out.println("07" + "\t" + "\tOTC" + "\t" + "    Amino Zinc Tablet" + "		Rs 7.00");
		System.out.println("08" + "\t" + "\tOTC" + "\t" + "    Burnex" + "			Rs 4.00"); // 1353fn
		System.out.println("09" + "\t" + "\tOTC" + "\t" + "    Fabuloss 5" + "			Rs 3.00");
		System.out.println("10" + "\t" + "\tOTC" + "\t" + "    Royal Propollen" + "		Rs 5.00");
		System.out.println("***********************************************************************************\n");
		// temp = new node;

		System.out.println("Type Order no: ");
		newNode.reciept_number = sc.nextInt();

		System.out.println("Enter Customer Name: ");
		newNode.customerName = sc.next();

		System.out.println("Enter Date : ");
		newNode.date = sc.next();

		System.out.println("How many Medicine would you like to order:");
		System.out.println("( Maximum is 10 order for each transaction ) \n");
		System.out.println("  ");
		newNode.x = sc.nextInt();

		if (newNode.x > 10) {
			System.out.println("The Medicine you order is exceed the maximum amount of order !");
		} else {
			for (i = 0; i < newNode.x; i++) {
				System.out.println("*********************************************");
				System.out.println("Please enter your selection : ");
				newNode.menu2[i] = sc.nextInt();

				System.out.println("Medicine Name: " + newNode.medicineName[newNode.menu2[i] - 1]);

				System.out.println("How many medicine do you want: ");
				newNode.quantity[i] = sc.nextInt();

				newNode.amount[i] = newNode.quantity[i] * newNode.Medicine[newNode.menu2[i] - 1];
				System.out.println("The amount You need to pay is: " + newNode.amount[i] + " Rs");

			}
		}
		System.out.println("===========================================================================");
		System.out.println("Order Taken Successfully");
		System.out.println("===========================================================================");
		System.out.println("Go to Reciept Menu to Pay The Bill");
		System.out.println("===========================================================================");

		// add to beginning of list
		if (start_ptr != null) {
			newNode.next = start_ptr;
		}
		start_ptr = newNode;

	}// End function take_order

	void delete_order() {
		Node1 temp = start_ptr;
		Node1 last;

		System.out.println("Enter the data you want to delete \n");
		int num = sc.nextInt();
		if (start_ptr == null)
			System.out.println("list is empty");
		if (start_ptr.reciept_number == num) {

			start_ptr = start_ptr.next;
			if (start_ptr == null)
				last = null;
			System.out.println("Data deleted successfully..");
			return;
		} else {

			while (temp.next != null) {
				if (start_ptr.next.reciept_number == num) {
					temp.next = temp.next.next;
					System.out.println("Data deleted successfully..");
					return;
				}
				temp = temp.next;
			}

			if (temp.next == null)
				System.out.println("Data is not in list");

		}

	}// End function delete_order

	void daily_summary() // Function to display Daily Summary
	{
		int i, num;
		Node1 temp = start_ptr;

		if (temp == null) {
			System.out.println("\t\t\tThere is no Order to show\n\t\t\tSo The List is Empty\n\n\n");
		} else {
			System.out.println("\n");
			System.out.println("===========================================================================");
			System.out.println(" \t\tHere is the Daily Summary of All Orders \n"); // print all receipt
			System.out.println("===========================================================================");

			while (temp != null) {

				System.out.println("Reciept Number : " + temp.reciept_number);
				
				System.out.println("Customer Name: " + temp.customerName);

				System.out.println("Order Date : " + temp.date);

				System.out.println("__________________________");

				System.out.println("==========================================================================");
				System.out.println("|  Medicine Type |   Medicine Name    |    Quantity     |    Total Price |");
				System.out.println("=======**==================**================**===============**==========");

				for (i = 0; i < temp.x; i++) {
					System.out.print(temp.type + "\t");
					System.out.print(temp.medicineName[temp.menu2[i] - 1] + "\t");
					System.out.print(temp.quantity[i]+"\t\t" );
					System.out.print(temp.amount[i] + "Rs");
					System.out.println("\n");
					System.out.println("_____________________________________________________________________________________________");
				}

				for (int j = 0; j < 10; j++) {
					temp.total += temp.amount[j];
				}
				System.out.println("Total Bill is : " + temp.total);

				System.out.println("");
				System.out.println("");
				System.out.println("\n___________________________\n");

				temp = temp.next;

			} // end while
		} // end else
	}// End daily summary

	void order_list() // Function to display receipt
	{
		int i, num, num2;
		boolean found; // variable to search

		Node1 temp = start_ptr;
		found = false;

		System.out.println(" Enter the Reciept Number To Print The Reciept\n");
		num2 = sc.nextInt();
		System.out.println("\n");
		System.out.println("===========================================================================");
		System.out.println("\t\tHere is the Order list\n");
		System.out.println("===========================================================================");

		if (temp == null) {
			System.out.println("\tThere is no Order to show\n\t\t\tSo The List is Empty\n\n\n");
		}

		while (temp != null && !found) {
			if (temp.reciept_number == num2) {
				found = true;
			} else {
				temp = temp.next;
			}

			if (found) // print the receipt
			{
				System.out.println("Reciept Number : " + temp.reciept_number);
				System.out.println("\n");
				System.out.println("Customer Name: " + temp.customerName);
				System.out.println("Order Date : " + temp.date);

				System.out.println("___________________________");

				System.out.println("===============================================================================");
				System.out.println("|  Medicine Type |     Medicine Name    |  	Quantity     |    Total Price |");
				System.out.println("=======++==================++================++===============++===============");

				for (i = 0; i < temp.x; i++) {
					System.out.print(temp.type + "\t");
					System.out.print(temp.medicineName[temp.menu2[i] - 1] + "\t\t");
					System.out.print(temp.quantity[i] + "\t\t");
					System.out.print(temp.amount[i] + " Rs");
					System.out.print("\n");
					System.out.println("_________________________________________________________________________________");
				}

				for (int j = 0; j < 10; j++) {
					temp.total += temp.amount[j];
				}

				System.out.println("Total Bill is : " + temp.total);
				System.out.println("\n");

				System.out.println("Type the exact amount You need to pay: ");
				num = sc.nextInt();

				System.out.println("\n");
				System.out.println("\n");
				System.out.println("Payment Done\nThank You\n");
				System.out.println("\n___________________________\n");
			}

		} // while end
	} // End function order_list

	void modify() // function to modify order
	{
		int i, ch, sid;
		boolean found;
		found = false;
		Node1 temp = start_ptr;

		System.out.println("Enter Receipt Number To Modify: ");
		sid = sc.nextInt();

		if (temp == null && sid == 0) {
			System.out.println("NO RECORD TO MODIFY..!");
		} else {

			while (temp != null && !found) {
				if (temp.reciept_number == sid) {
					found = true;
				} else {
					temp = temp.next;
				}
				if (found) {
					System.out.println("Change  Order Number : ");
					temp.reciept_number = sc.nextInt();

					System.out.println("Change Customer Name: ");
					temp.customerName = sc.next();

					System.out.println("Change Date : ");
					temp.date = sc.next();

					System.out.println("How many New Medicine would you like to Change:");
					System.out.println("( Maximum is 10 order for each transaction ) \n");
					System.out.println("  ");
					temp.x = sc.nextInt();

					if (temp.x > 10) {
						System.out.println("The Medicine you order is exceed the maximum amount of order !");
					} else {
						for (i = 0; i < temp.x; i++) {

							System.out.println("Please enter your selection to Change: ");
							temp.menu2[i] = sc.nextInt();

							System.out.println("Change Medicine Name: " + temp.medicineName[temp.menu2[i] - 1]);
							System.out.println("How many New medicine do you want: ");
							temp.quantity[i] = sc.nextInt();

							temp.amount[i] = temp.quantity[i] * temp.Medicine[temp.menu2[i] - 1];
							System.out
									.println("The amount You need to pay After Modify  is: " + temp.amount[i] + " RM");

						}
						temp = temp.next;

					} // else

					System.out.println("RECORD MODIFIED....!");
				} // if
				else {
					if (temp != null && temp.reciept_number != sid) {
						System.out.println("Invalid Reciept Number...!");
					}
				}
			} // while
		} // end else
	}// End modify function

	void Mainmenu() // Function to exit
	{
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
	} // end function exit

	

}
