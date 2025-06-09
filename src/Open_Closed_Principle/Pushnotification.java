package Open_Closed_Principle;

public class Pushnotification extends Notification {
    @Override
    public void send(String message) {
        System.out.println("Push notification sent: " + message);
    }
}
