package NotificationSystem.Service.NotificationService;

import NotificationSystem.Service.Notification.NotificationDispatcherFactory;
import NotificationSystem.Service.Notification.NotificationDispatcherService;
import NotificationSystem.Service.Observables.CustomerService;

public class SipNotificationObserver implements NotificationService {
    CustomerService sipService;
    String email;
    String channel;

    public SipNotificationObserver(CustomerService sipService, String email,String channel){
        this.sipService = sipService;
        this.email = email;
        this.channel = channel;
    }

    NotificationDispatcherFactory notificationDispatcherFactory = new NotificationDispatcherFactory();

    @Override
    public void update() {
        NotificationDispatcherService notificationDispatcherService = notificationDispatcherFactory.getDispatcher(channel);
        System.out.println("Sending sip message");
        notificationDispatcherService.push();
    }
}
