package NotificationSystem.Service.NotificationService;

import NotificationSystem.Service.Observables.CustomerService;

public class BillNotificationObserver implements NotificationService {
    public CustomerService customerService;
    public String email;

    public BillNotificationObserver(CustomerService notificationObservables, String email){
        this.email = email;
        this.customerService = notificationObservables;
    }
    @Override
    public void update() {
        System.out.println("Sending notification");
    }
}
