// Abstract Offering class that will be extended by all concrete offerings and decorators
abstract class Offering {
    public abstract String getName();
    public abstract double getPrice();
}

// Concrete Offering (Coffee in this case)
class Coffee extends Offering {
    @Override
    public String getName() {
        return "Coffee";
    }

    @Override
    public double getPrice() {
        return 5.0;
    }
}

// Abstract Decorator class that extends Offering
public abstract class Decorator extends Offering {
    protected Offering offering;

    public Decorator(Offering offering) {
        this.offering = offering;
    }

    @Override
    public abstract String getName();

    @Override
    public abstract double getPrice();
}

// Concrete Decorator (Rum)
class Rum extends Decorator {
    public Rum(Offering offering) {
        super(offering);
    }

    @Override
    public String getName() {
        return offering.getName() + " with Rum";
    }

    @Override
    public double getPrice() {
        return offering.getPrice() + 2.0;
    }
}

// Concrete Decorator (Milk)
class Milk extends Decorator {
    public Milk(Offering offering) {
        super(offering);
    }

    @Override
    public String getName() {
        return offering.getName() + " with Milk";
    }

    @Override
    public double getPrice() {
        return offering.getPrice() + 1.5;
    }
}

// Concrete Decorator (Sugar)
class Sugar extends Decorator {
    public Sugar(Offering offering) {
        super(offering);
    }

    @Override
    public String getName() {
        return offering.getName() + " with Sugar";
    }

    @Override
    public double getPrice() {
        return offering.getPrice() + 0.5;
    }
}

// Main class to test the Decorator pattern
public class CoffeeShop {
    public static void main(String[] args) {
        Offering coffee = new Coffee();  // Start with a basic Coffee

        // Add Rum, Milk, and Sugar to the Coffee
        coffee = new Rum(coffee);  // Coffee with Rum
        coffee = new Milk(coffee); // Coffee with Rum and Milk
        coffee = new Sugar(coffee); // Coffee with Rum, Milk, and Sugar

        // Print out the final result
        System.out.println("Your order: " + coffee.getName());
        System.out.println("Total price: $" + coffee.getPrice());
    }
}
