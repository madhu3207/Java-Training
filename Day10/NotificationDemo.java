package Day10;

interface NotificationService {
    void send();
}

class EmailNotification implements NotificationService {
    public void send() {
        System.out.println("Email Sent");
    }
}

class SMSNotification implements NotificationService {
    public void send() {
        System.out.println("SMS Sent");
    }
}

class PushNotification implements NotificationService {
    public void send() {
        System.out.println("Push Notification Sent");
    }
}

public class NotificationDemo {
    public static void main(String[] args) {
        NotificationService n = new EmailNotification();
        n.send();

        n = new SMSNotification();
        n.send();

        n = new PushNotification();
        n.send();
    }
}
