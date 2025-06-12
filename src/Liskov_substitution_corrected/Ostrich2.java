package Liskov_substitution_corrected;

public class Ostrich2 implements Bird2 {
    public void layEggs() {
        System.out.println("Ostrich laying eggs");
    }
    // No fly method - doesn't break expectations
}


