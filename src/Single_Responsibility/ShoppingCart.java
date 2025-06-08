package Single_Responsibility;


    //This code violates the single responsibility principle (SRP) because the Single_Responsibility.ShoppingCart class has multiple responsibilities: managing items, calculating totals, processing payments, and printing invoices. Each of these responsibilities should ideally be handled by separate classes.

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
