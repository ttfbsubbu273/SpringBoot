package org.applicationone.application_boot;


public class Basicdetails implements Details {
	
	String name = "Subrahmanya Bhat";
	String place = "Honnavara";
	int age = 23;
	String contact = "8762313835";
	String email = "ttfbsubu273@gmail.com";
	String work = "Quantiphi";
	
	public void display() {
		System.out.println("Name of Candidate: " + name);
		System.out.println("Place of Candidate: " + place);
		System.out.println("Age of Candidate: " + age);
		System.out.println("Contact Number of Candidate: " + contact);
		System.out.println("Email ID of Candidate: " + email);
		System.out.println("Candidate work in: " + work);
	}
}
