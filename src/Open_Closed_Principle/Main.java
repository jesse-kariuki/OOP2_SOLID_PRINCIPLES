package Open_Closed_Principle;
public class Main {
    public static void main(String[] args) {
        improved_Notificationservice service = new improved_Notificationservice();

        service.sendNotification(new Emailnotification(), "Hello via Email!");
        service.sendNotification(new Pushnotification(), "Hello via Push!");
        service.sendNotification(new SMSnotification(), "Hello via SMS!");
    }
}
