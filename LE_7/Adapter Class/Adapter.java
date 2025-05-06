public class Adapter {
    public static void main(String[] args) {
        Crow indianCrow = new IndianCrow(); 
        Swarm adaptedCrow = new CrowAdapter(indianCrow);

        adaptedCrow.eat();
        adaptedCrow.swim();
        adaptedCrow.sing();
    }
}
