package com.MedicineOrder;

public class Node1 {
	int reciept_number;
	String customerName;
	String date;
	int quantity[] = new int[10];
	String type = "OTC";
	int x;
	int menu2[] = new int[10];
	double amount[] = new double[10];
	String medicineName[] = { "Probiotics", "Vitamin C(500mg)", "Febrex Plus", "Women'S Multivate",
			"Novamox 500", "Crocine","Pan-D", "Burnex", "Sinarest", "Cyclopalm" };
	double Medicine[] = { 2.00, 3.00, 1.00, 4.00, 1.00, 5.00, 7.00, 4.00, 3.00, 5.00 };
	double total;
	Node1 next = null;

}
