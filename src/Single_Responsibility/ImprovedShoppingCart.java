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
