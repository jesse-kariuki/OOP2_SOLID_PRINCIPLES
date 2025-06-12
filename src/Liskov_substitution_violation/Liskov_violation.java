package Liskov_substitution_violation;

public class Liskov_violation {
    public static void makeBirdFly(Bird bird) {
        bird.fly(); // This will break if bird is an Ostrich
    }

    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        //Bird ostrich = new Ostrich();

        makeBirdFly(sparrow);  // Works fine
       // makeBirdFly(ostrich);  // Throws exception - violates Liskov principle
    }
}

