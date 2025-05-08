public class CrowAdapter implements Swan {
    private Crow crow;

    public CrowAdapter(Crow crow) {
        this.crow = crow;
    }

    public void swim() {
        crow.fly(); 
    }

    public void sing() {
        crow.cry(); 
    }

    public void eat() {
        crow.eat();
    }
}
