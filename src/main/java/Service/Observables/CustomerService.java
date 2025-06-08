package main.java.Service.Observables;

import main.java.Service.NotificationService.NotificationService;

public interface CustomerService {
    public void add(NotificationService notificationService);
    public void remove(NotificationService notificationService);
    public void notifyA();
    public void setData(int bill);
    public Integer getData();
}
