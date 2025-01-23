
class Animal {

    public void makeSound() {
        System.out.println("Some animal sound");
    }
}


class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Moo");
    }
}


class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}


class Pig extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Oink");
    }
}


class Goat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Baa");
    }
}


class Lion extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Roar");
    }
}


public class Voice {

    public void prepareVoice() {
        Animal[] animals = new Animal[5];


        animals[0] = new Cow();
        animals[1] = new Dog();
        animals[2] = new Pig();
        animals[3] = new Goat();
        animals[4] = new Lion();

      
        hear(animals);
    }

    
    public void hear(Animal[] animals) {
        for (Animal animal : animals) {
            animal.makeSound();  
        }
    }
}
