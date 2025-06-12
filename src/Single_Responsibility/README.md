# Single Responsibility Principle (SRP) Example in Java

This project demonstrates the Single Responsibility Principle by showing a shopping cart example before and after applying SRP.

---

## 1. ShoppingCart.java (Violates SRP)

This class manages items, calculates totals, processes payments, and prints invoices — all in one class.

```java
package Single_Responsibility;

// This code violates the single responsibility principle (SRP) because the Single_Responsibility.ShoppingCart class has multiple responsibilities: managing items, calculating totals, processing payments, and printing invoices. Each of these responsibilities should ideally be handled by separate classes.

public class ShoppingCart {
    public void addItem(String item) {
        System.out.println("Adding item: " + item);
    }

    public double calculateTotal() {
        System.out.println("Calculating total...");
        return 100.0;
    }

    public void processPayment() {
        System.out.println("Processing payment...");
    }

    public void printInvoice() {
        System.out.println("Printing invoice...");
    }
}
```

## 2. ImprovedShoppingCart.java (Adheres to SRP)

It has only one responsibility: managing items and their totals. Other responsibilities are handled by separate classes.

```java
package Single_Responsibility;

// This code adheres to the Single Responsibility Principle (SRP) by separating the concerns of managing items, processing payments, and printing invoices into distinct classes.

public class ImprovedShoppingCart {
    public void addItem(String item) {
        System.out.println("Adding item: " + item);
    }

    public double calculateTotal() {
        // dummy calculation
        return 100.0;
    }
}
```

## 3. PaymentProcessor.java (Handles Payment Processing)

This class is responsible for processing payments.

```java
package Single_Responsibility;

public class PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Processing payment of $ " + amount+"...");
    }
}
```

## 4. InvoicePrinter.java

This class is responsible for printing invoices.

```java
package Single_Responsibility;

public class InvoicePrinter {
    public void printInvoice() {
        System.out.println("Printing invoice...");
    }
}
```

## 5. Main.java

This is the entry point which demonstrates the use of the SRP-compliant classes.

```java
package Single_Responsibility;

// Demonstration of the use of objects that have one responsibility each, adhering to the Single Responsibility Principle.

public class Main {

    public static void main(String[] args) {
        ImprovedShoppingCart cart = new ImprovedShoppingCart();
        cart.addItem("Laptop");

        double total = cart.calculateTotal();

        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.processPayment(total);

        InvoicePrinter invoicePrinter = new InvoicePrinter();
        invoicePrinter.printInvoice();
    }
}
```

---

# Open/Closed Principle (OCP) Example in Java

This project demonstrates the **Open/Closed Principle** by implementing a notification system. The system is initially designed in a way that violates the OCP and is later refactored to comply with it.

---

## 1. NotificationService.java (Violates OCP)

This class handles sending notifications but requires modification every time a new notification type is added. This violates the Open/Closed Principle, which states that classes should be **open for extension but closed for modification**.

```java
// This code violates the Open/Closed Principle (OCP) because the NotificationService class must be modified
// whenever a new type of notification is added.

public class NotificationService {
    public void send(String type, String message) {
        if (type.equals("email")) {
            System.out.println("Email sent: " + message);
        } else if (type.equals("push")) {
            System.out.println("Push notification sent: " + message);
        }
        // Adding SMS or other types requires modifying this class!
    }
}
```

## 2. Notification.java (Abstract Base Class)

To adhere to OCP, we introduce an abstract class for notifications. New types can now be added by extending this class — without modifying existing code.

```java
package Open_Closed_Principle;

// Abstract base class representing a notification type
public abstract class Notification {
    public abstract void send(String message);
}
```

## 3. Concrete Implementations (Extending Notification)

Each new notification type (Email, Push, SMS) extends the `Notification` class and provides its own implementation.

### EmailNotification.java

```java
package Open_Closed_Principle;

public class EmailNotification extends Notification {
    @Override
    public void send(String message) {
        System.out.println("Email sent: " + message);
    }
}
```

### PushNotification.java

```java
package Open_Closed_Principle;

public class PushNotification extends Notification {
    @Override
    public void send(String message) {
        System.out.println("Push notification sent: " + message);
    }
}
```

### SMSNotification.java

```java
package Open_Closed_Principle;

public class SMSNotification extends Notification {
    @Override
    public void send(String message) {
        System.out.println("SMS sent: " + message);
    }
}
```

## 4. NotificationService.java (Refactored — Adheres to OCP)

The `NotificationService` is now designed to work with the `Notification` abstraction. It no longer needs to be modified when new types are added.

```java
package Open_Closed_Principle;

// This version adheres to OCP: no modification is needed when new notification types are added.
public class NotificationService {
    public void sendNotification(Notification notification, String message) {
        notification.send(message);
    }
}
```

## 5. Main.java

This is the entry point that demonstrates sending different types of notifications using the OCP-compliant structure.

```java
package Open_Closed_Principle;

public class Main {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();

        Notification email = new EmailNotification();
        Notification push = new PushNotification();
        Notification sms = new SMSNotification();

        service.sendNotification(email, "Hello via Email!");
        service.sendNotification(push, "Hello via Push!");
        service.sendNotification(sms, "Hello via SMS!");
    }
}
```
