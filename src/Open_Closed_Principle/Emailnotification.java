package Open_Closed_Principle;
public class Emailnotification extends Notification {
    @Override
    public void send(String message) {
        System.out.println("Email sent: " + message);
    }
}