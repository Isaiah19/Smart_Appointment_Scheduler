package com.scheduler.models;

public class Admin extends User {
	public Admin(String id, String name, String email) {
		super(id, name, email);
	}

	@Override
	public void displayRole() {
		System.out.println("Role: Admin");
	}
}
