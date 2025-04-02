package com.scheduler.models;

import java.time.LocalDateTime;

public class Appointment {
	private String id;
	private LocalDateTime appointmentTime;
	private ServiceProvider serviceProvider;
	private Client client;

	public Appointment(String id, LocalDateTime appointmentTime, ServiceProvider serviceProvider, Client client) {
		this.id = id;
		this.appointmentTime = appointmentTime;
		this.serviceProvider = serviceProvider;
		this.client = client;
	}

	public void displayAppointmentDetails() {
		System.out.println("Appointment ID: " + id);
		System.out.println("Service Provider: " + serviceProvider.name);
		System.out.println("Client: " + client.name);
		System.out.println("Appointment Time: " + appointmentTime);
	}

	// Getters and Setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
	this.id = id;
	}

	public LocalDateTime getAppointmentTime() {
		return appointmentTime;
	}

	public void setAppointmentTime(LocalDateTime appointmentTime) {
		this.appointmentTime = appointmentTime;
	}

	public ServiceProvider getServiceProvider() {
		return serviceProvider;
	}

	public void setServiceProvider(ServiceProvider serviceProvider) {
		this.serviceProvider = serviceProvider;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
}
