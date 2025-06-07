package NotificationSystem.Service.Observables;

import NotificationSystem.Service.NotificationService.NotificationService;

import java.util.ArrayList;
import java.util.List;

public class SipService implements CustomerService {
    int currPrice = 0;
    List<NotificationService> notificationServiceList = new ArrayList<>();
    @Override
    public void add(NotificationService notificationService) {
        notificationServiceList.add(notificationService);
    }

    @Override
    public void remove(NotificationService notificationService) {
        notificationServiceList.remove(notificationService);
    }

    @Override
    public void notifyA() {
        for(NotificationService notificationService : notificationServiceList){
            notificationService.update();
        }
    }

    @Override
    public void setData(int newPrice) {
        if(currPrice!=newPrice){
            currPrice=newPrice;
            notifyA();
        }
    }
}
