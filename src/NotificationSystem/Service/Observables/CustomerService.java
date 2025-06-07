package NotificationSystem.Service.Observables;

import NotificationSystem.Service.NotificationService.NotificationService;

public interface CustomerService {
    public void add(NotificationService notificationService);
    public void remove(NotificationService notificationService);
    public void notifyA();
    public void setData(int bill);
}
