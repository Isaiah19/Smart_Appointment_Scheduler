package com.scheduler.models;

public class UserFactory {
	public static User createUser(String type, String id, String name, String email) {
		if (type.equalsIgnoreCase("admin")) {
			return new Admin(id, name, email);
		} else if (type.equalsIgnoreCase("serviceProvider")) {
			return new ServiceProvider(id, name, email, "General");
		} else if (type.equalsIgnoreCase("client")) {
			return new Client(id, name, email, "Unknown");
		}
		return null;
	}
}
