package main.java.Service.NotificationService;

import main.java.Service.Observables.CustomerService;

public class BillNotificationObserver implements NotificationService {
    public CustomerService customerService;
    public String email;

    public BillNotificationObserver(CustomerService notificationObservables, String email){
        this.email = email;
        this.customerService = notificationObservables;
    }
    @Override
    public void update() {
        System.out.println("Sending notification for the bill change with new bill: "+customerService.getData());
    }
}
