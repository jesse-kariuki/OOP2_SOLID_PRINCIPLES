package Liskov_substitution_violation;

public class Ostrich extends Bird {
    @Override
    public void fly()  {
        // Ostriches can't fly - this violates the expectation from the parent class
        throw new UnsupportedOperationException("Ostriches can't fly");
    }
}

