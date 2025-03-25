class Whiskey extends beverage {
    @Override
    protected void amount(int amt) { 
        System.out.println(amt + " ml");
    }
    protected void stir(){
        System.out.println("Stir");
    }
}
