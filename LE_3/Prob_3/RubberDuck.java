public class RubberDuck implements Swimmable, Squeakable {
    @Override
    public void swim() {
        System.out.println("Rubber Duck is swimming.");
    }

    @Override
    public void squeak() {
        System.out.println("Rubber Duck squeaks.");
    }
}
