abstract class Offering {
    abstract int getPrice();
    abstract String getName();
}

class Coffee extends Offering {
    int getPrice() {
        return 30;
    }
    String getName() {
        return "Coffee";
    }
}

class Tea extends Offering {
    int getPrice() {
        return 40;
    }
    String getName() {
        return "Tea";
    }
}

abstract class Decorator extends Offering {
    Offering offering;
    Decorator(Offering offering) {
        this.offering = offering;
    }
}

class Rum extends Decorator {
    Rum(Offering offering) {
        super(offering);
    }
    String getName() {
        return offering.getName() + " With Rum";
    }
    int getPrice() {
        return offering.getPrice() + 20;
    }
}

class Gin extends Decorator {
    Gin(Offering offering) {
        super(offering);
    }
    String getName() {
        return offering.getName() + " With Gin";
    }
    int getPrice() {
        return offering.getPrice() + 15;
    }
}

class Icecream extends Decorator {
    Icecream(Offering offering) {
        super(offering);
    }
    String getName() {
        return offering.getName() + " With Icecream";
    }
    int getPrice() {
        return offering.getPrice() + 25;
    }
}

class Main {
    public static void main(String[] args) {
        Offering offering = new Coffee();
        offering = new Rum(offering);
        offering = new Gin(offering);
        offering = new Icecream(offering);
        System.out.println(offering.getName() + " " + offering.getPrice());
    }
}
