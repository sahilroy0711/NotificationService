package main.java.Service.NotificationService;

import main.java.Service.Observables.CustomerService;
import main.java.Service.NotificationDispatcherFactory;
import main.java.Service.NotificationDispatcherService;
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
        System.out.println("Sending sip message for price change to: "+sipService.getData());
        NotificationDispatcherService notificationDispatcherService = notificationDispatcherFactory.getDispatcher(channel);
        System.out.println("Sending sip message");
        notificationDispatcherService.push();
    }
}
