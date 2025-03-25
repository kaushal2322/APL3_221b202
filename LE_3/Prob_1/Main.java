public class Main {
    public static void main(String[] args) {
        Arjun arjun = new Arjun();
        Bheem bheem = new Bheem();
        Duryodhan duryodhan = new Duryodhan();
        Vikarn vikarn = new Vikarn();

        // Testing Arjun
        arjun.fight();
        arjun.obey();
        arjun.kind();

        // Testing Bheem
        bheem.fight();
        bheem.obey();
        bheem.kind();

        // Testing Duryodhan
        duryodhan.fight();
        duryodhan.disobey();
        duryodhan.cruel();

        // Testing Vikarn
        vikarn.fight();
        vikarn.disobey();
        vikarn.cruel();
    }
}
