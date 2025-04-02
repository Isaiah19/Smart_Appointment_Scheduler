package com.scheduler.services;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {
	private List<String> notifications;

	public NotificationService() {
	notifications = new ArrayList<>();
	}

	public void addNotification(String message) {
	notifications.add(message);
	}

	public void notifyUsers() {
		for (String notification : notifications) {
			System.out.println("Notification: " + notification);
		}
	}
}
