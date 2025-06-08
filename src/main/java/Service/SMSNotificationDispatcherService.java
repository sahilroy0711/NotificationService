package main.java.Service;

public class SMSNotificationDispatcherService implements NotificationDispatcherService {
    @Override
    public void push() {
        System.out.println("Notification sent through SMS");
    }
}
