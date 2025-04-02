package com.scheduler.models;

public class ServiceProvider extends User {
	private String specialty;

	public ServiceProvider(String id, String name, String email, String specialty) {
		super(id, name, email);
		this.specialty = specialty;
	}

	@Override
	public void displayRole() {
		System.out.println("Role: Service Provider");
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
}
