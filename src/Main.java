import NotificationSystem.Service.NotificationService.BillNotificationObserver;
import NotificationSystem.Service.Observables.BillService;
import NotificationSystem.Service.Observables.CustomerService;
import NotificationSystem.Service.Observables.SipService;
import NotificationSystem.Service.NotificationService.SipNotificationObserver;

public class Main {
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