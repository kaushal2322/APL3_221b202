public class Main {
    public static void main(String[] args) {
        beverage whiskey = new Whiskey();
        whiskey.templateMethod(60);
        System.out.println();
        beverage rum = new Rum();
        rum.templateMethod(90);
    }
}
