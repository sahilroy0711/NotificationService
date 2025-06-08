package main.java.Service.NotificationService;

import main.java.Service.Observables.CustomerService;

public class SipNotificationObserver implements NotificationService {
    CustomerService sipService;
    String email;

    public SipNotificationObserver(CustomerService sipService, String email){
        this.sipService = sipService;
        this.email = email;
    }

    @Override
    public void update() {
        System.out.println("Sending sip message for price change to: "+sipService.getData());
    }
}
