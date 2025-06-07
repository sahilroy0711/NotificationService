package NotificationSystem.Service.NotificationService;

import NotificationSystem.Service.Observables.CustomerService;

public class SipNotificationObserver implements NotificationService {
    CustomerService sipService;
    String email;

    public SipNotificationObserver(CustomerService sipService, String email){
        this.sipService = sipService;
        this.email = email;
    }

    @Override
    public void update() {
        System.out.println("Sending sip message");
    }
}
