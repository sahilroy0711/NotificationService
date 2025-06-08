package NotificationSystem.Service.NotificationService;

import NotificationSystem.Service.Notification.NotificationDispatcherFactory;
import NotificationSystem.Service.Notification.NotificationDispatcherService;
import NotificationSystem.Service.Observables.CustomerService;

public class BillNotificationObserver implements NotificationService {
    public CustomerService customerService;
    public String email;
    public String channel;

    public BillNotificationObserver(CustomerService notificationObservables, String email, String channel){
        this.email = email;
        this.customerService = notificationObservables;
        this.channel = channel;
    }
    NotificationDispatcherFactory notificationDispatcherFactory = new NotificationDispatcherFactory();
    @Override
    public void update() {
        NotificationDispatcherService notificationDispatcherService = notificationDispatcherFactory.getDispatcher(channel);
        System.out.println("Sending  bill notification");
        notificationDispatcherService.push();
    }
}
