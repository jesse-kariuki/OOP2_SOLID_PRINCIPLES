package Single_Responsibility;


//Demonstation of the use of objects that have one responsibility each, adhering to the Single Responsibility Principle.
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
