package main.java.Service.Observables;

import main.java.Service.NotificationService.NotificationService;

import java.util.ArrayList;
import java.util.List;

public class BillService implements CustomerService {
    int currBill = 0;
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
    public void setData(int bill) {
        if(currBill!=bill){
            currBill=bill;
            notifyA();
        }
    }

    @Override
    public Integer getData(){
        return currBill;
    }
}
