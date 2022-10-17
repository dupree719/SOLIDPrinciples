package l;

// Liskov Substitution Principle
//You should use inheritance only for substitutability.

public class LiskovSubstitution {

    public static void main(String[] args) {

        // can't fly
        Ostrich ostrich = new Ostrich();
        ostrich.greet();

        // can fly
        Sparrow sparrow = new Sparrow();

        sparrow.fly();
    }
}


