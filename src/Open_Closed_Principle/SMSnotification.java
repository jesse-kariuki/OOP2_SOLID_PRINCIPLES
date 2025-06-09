package Open_Closed_Principle;

public class SMSnotification extends Notification {
    @Override
    public void send(String message) {
        System.out.println("SMS sent: " + message);
    }
}
