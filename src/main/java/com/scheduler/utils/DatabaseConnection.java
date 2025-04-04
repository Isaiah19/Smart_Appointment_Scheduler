package com.scheduler.utils;

public class DatabaseConnection {
	private static DatabaseConnection instance;

	private DatabaseConnection() {
	// Private constructor to prevent instantiation
	}

	public static DatabaseConnection getInstance() {
		if (instance == null) {
			instance = new DatabaseConnection();
		}
		return instance;
	}

	public void connect() {
		System.out.println("Connected to the database");
	}

	public void disconnect() {
		System.out.println("Disconnected from the database");
	}
}
