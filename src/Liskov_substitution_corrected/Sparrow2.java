package Liskov_substitution_corrected;

public class Sparrow2 implements FlyingBird {
    public void fly() {
        System.out.println("Sparrow flying");
    }

    public void layEggs() {
        System.out.println("Sparrow laying eggs");
    }
}

