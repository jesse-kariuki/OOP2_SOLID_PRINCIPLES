#open/Closed Principle(OCP)
JAVA  snipet code demonstrating OCP using a notification system .Using class inheritance  the system sends notifications without modifying existing code when new types are added 

#PROJECT  STRUCTURE 
1.Notificationservice class violates OCP

public class Notificationservice {
public void send(String type, String message) {
if (type.equals("email")) {
System.out.println("Email sent:" + message);
} else if (type.equals("push")) {
System.out.println("Push notification sent:" + message);
}
//  Adding SMS requires modifying this class!
//  Harder to maintain and test.
}
}

2.Concrete  implementations for a solution 
 i)created an abstract base class
package Open_Closed_Principle;

public abstract class Notification {
public abstract void send(String message);
}
ii)IMPLIMENTATIONS
// EmailNotification.java
public class EmailNotification extends Notification {
@Override
public void send(String message) {
System.out.println("Email sent: " + message);
}
}

// PushNotification.java
public class PushNotification extends Notification {
@Override
public void send(String message) {
System.out.println("Push notification sent: " + message);
}
}

iii)refactoring service
package Open_Closed_Principle;

public class Notificationservice {
public void sendNotification(Notification notification, String message) {
notification.send(message); // No modifications for new types!
}
}

// SMSNotification.java
public class SMSNotification extends Notification {
@Override
public void send(String message) {
System.out.println("SMS sent: " + message);
}
}

iv) when Main.java is compiled  the expected output is
Email sent: Hello via Email!
Push notification sent: Hello via Push!
SMS sent: Hello via SMS!