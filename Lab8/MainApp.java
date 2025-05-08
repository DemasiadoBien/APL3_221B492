public class MainApp {
    public static void main(String[] args) {
        Crow crow = new IndianCrow();
        Swan swan = new CrowAdapter(crow);
        swan.eat();
        swan.swim();
        swan.sing();
    }
}
