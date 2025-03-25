abstract class beverage {
    protected void pour() {
        System.out.println("Pour");
    }
    protected abstract void amount(int amt);
    protected void stir() {}
    
    protected void serve() {
        System.out.println("Serve through waiter");
    }
    public final void templateMethod(int amt) {
        pour();
        amount(amt);
        stir();
        serve();
    }
}
