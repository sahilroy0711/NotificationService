package main.java.Service.NotificationService;

import main.java.Service.Observables.CustomerService;
import main.java.Service.NotificationDispatcherFactory;
import main.java.Service.NotificationDispatcherService;

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
        System.out.println("Sending notification for the bill change with new bill: "+customerService.getData());
        NotificationDispatcherService notificationDispatcherService = notificationDispatcherFactory.getDispatcher(channel);
        System.out.println("Sending  bill notification");
        notificationDispatcherService.push();
    }
}
