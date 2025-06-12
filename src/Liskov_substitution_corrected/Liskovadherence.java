package Liskov_substitution_corrected;

public class Liskovadherence {
    public static void makeFlyingBirdFly(FlyingBird bird) {
        bird.fly();
    }

    public static void main(String[] args) {
        FlyingBird sparrow = new Sparrow2();
        makeFlyingBirdFly(sparrow); // Works perfectly

        Bird2 ostrich = new Ostrich2();
        ostrich.layEggs(); // Ostrich does its own thing - no problem
    }
}

