class Main {
    public static void main(String[] args) {
        Beverage c = new Beer();
        c.templateMethod(60);
        
        Beverage b = new Whisky();
        b.templateMethod(40);
        
        Beverage d = new Rum();
        d.templateMethod(50);
    }
}