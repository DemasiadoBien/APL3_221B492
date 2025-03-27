abstract class Beverage {
    void pour(int q) {
        System.out.println("Pour " + q + "ml of Beverage");
    }
    
    protected abstract void addCondiment(int q);
    
    private void stir() {
        System.out.println("Stirring the beverage");
    }
    
    private void serve() {
        System.out.println("Serve via Waiter");
    }
    
    public void templateMethod(int q) {
        pour(q);
        addCondiment(q);
        stir();
        serve();
    }
}