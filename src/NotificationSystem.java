import main.java.Service.NotificationService.BillNotificationObserver;
import main.java.Service.Observables.BillService;
import main.java.Service.Observables.CustomerService;
import main.java.Service.Observables.SipService;
import main.java.Service.NotificationService.SipNotificationObserver;

public class NotificationSystem {
    public static void main(String[] args) {
        CustomerService billNotificationObservable = new BillService();
        CustomerService sipNotificationObservable = new SipService();

        BillNotificationObserver observer1 = new BillNotificationObserver(billNotificationObservable,"abc");
        BillNotificationObserver observer2 = new BillNotificationObserver(billNotificationObservable,"xyz");
        SipNotificationObserver observer3 = new SipNotificationObserver(sipNotificationObservable,"abcx");

        billNotificationObservable.add(observer1);
        billNotificationObservable.add(observer2);
        sipNotificationObservable.add(observer3);

        billNotificationObservable.setData(20);
        sipNotificationObservable.setData(200);
    }
}