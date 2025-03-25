interface Flyable {
    void fly();
}

interface Quackable {
    void quack();
}

abstract class Duck {
    void swim() {
        System.out.println("Duck can swim.");
    }
}

class RubberDuck extends Duck implements Quackable {
    public void quack() {
        System.out.println("Rubber Duck squeaks.");
    }
}

class WoodenDuck extends Duck {}

class RedHeadDuck extends Duck implements Flyable, Quackable {
    public void fly() {
        System.out.println("RedHead Duck flies.");
    }

    public void quack() {
        System.out.println("RedHead Duck quacks.");
    }
}

class LakeDuck extends Duck implements Flyable, Quackable {
    public void fly() {
        System.out.println("Lake Duck flies.");
    }

    public void quack() {
        System.out.println("Lake Duck quacks.");
    }
}

public class Main {
    public static void main(String[] args) {
        RubberDuck rubberDuck = new RubberDuck();
        WoodenDuck woodenDuck = new WoodenDuck();
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        LakeDuck lakeDuck = new LakeDuck();

        rubberDuck.swim();
        rubberDuck.quack();

        woodenDuck.swim();

        redHeadDuck.swim();
        redHeadDuck.fly();
        redHeadDuck.quack();

        lakeDuck.swim();
        lakeDuck.fly();
        lakeDuck.quack();
    }
}