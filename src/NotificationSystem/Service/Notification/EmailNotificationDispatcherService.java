package NotificationSystem.Service.Notification;

public class EmailNotificationDispatcherService implements NotificationDispatcherService{
    @Override
    public void push(){
        System.out.println("Notification sent through Email");
    }
}
