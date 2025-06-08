package NotificationSystem.Service.Notification;

import java.util.HashMap;
import java.util.Map;

public class NotificationDispatcherFactory {
    private final Map<String, NotificationDispatcherService> notificationDispatcherServiceMap;

    public NotificationDispatcherFactory(){
        this.notificationDispatcherServiceMap = new HashMap<>();

        notificationDispatcherServiceMap.put("EMAIL",new EmailNotificationDispatcherService());
        notificationDispatcherServiceMap.put("SMS",new SMSNotificationDispatcherService());
    }
    public NotificationDispatcherService getDispatcher(String channel){
        return notificationDispatcherServiceMap.getOrDefault(channel,null);
    }
}
