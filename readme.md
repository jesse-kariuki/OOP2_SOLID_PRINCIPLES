# Single Responsibility Principle (SRP) Example in Java

This project demonstrates the Single Responsibility Principle by showing a shopping cart example before and after applying SRP.

---

### 1. ShoppingCart.java (Violates SRP)

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

### 2.  ImprovedShoppingCart.java (Adheres to SRP)
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

### 3. PaymentProcessor.java (Handles Payment Processing)
This class is responsible for processing payments.

```java
package Single_Responsibility;

public class PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Processing payment of $ " + amount+"...");
    }
}

```

### 4. InvoicePrinter.java
This class is responsible for printing invoices.
```java
package Single_Responsibility;

public class InvoicePrinter {
    public void printInvoice() {
        System.out.println("Printing invoice...");
    }
}

```

### 5. Main.java
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