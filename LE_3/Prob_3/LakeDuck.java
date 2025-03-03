public class LakeDuck implements Swimmable, Flyable, Quackable {
    @Override
    public void swim() {
        System.out.println("Lake Duck is swimming.");
    }

    @Override
    public void fly() {
        System.out.println("Lake Duck is flying.");
    }

    @Override
    public void quack() {
        System.out.println("Lake Duck is quacking.");
    }
}
