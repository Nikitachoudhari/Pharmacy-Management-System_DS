package com.DoctorAppointment;

public class Node {
	private String patientName;
	private String disease;
	private String drName;
	private String date;
	
	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public String getDrName() {
		return drName;
	}

	public void setDrName(String drName) {
		this.drName = drName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	Node next;

	Node(String patientName , String disease , String drName , String date )
	{
		this.patientName = patientName;
		this.disease = disease;
		this.drName= drName;
		this.date = date;
		next = null;
	}
}
