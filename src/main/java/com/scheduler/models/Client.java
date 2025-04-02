package com.scheduler.models;

public class Client extends User {
	private String phoneNumber;

	public Client(String id, String name, String email, String phoneNumber) {
		super(id, name, email);
		this.phoneNumber = phoneNumber;
	}

	@Override
	public void displayRole() {
		System.out.println("Role: Client");
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
