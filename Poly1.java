/*Create a base class called Animal with a method makeSound(). Derive three classes Dog, Cat, and Cow from Animal. Implement the makeSound() method in each derived class to make a different sound (e.g., "Woof", "Meow", "Moo"). Use polymorphism to create an array of Animal objects and call the makeSound() method on each object.*/
import java.util.ArrayList;

abstract class Animal {
    public abstract void makeSound();
}

class Dog extends Animal {
   
    public void makeSound() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    
    public void makeSound() {
        System.out.println("Meow");
    }
}

class Cow extends Animal {
    
    public void makeSound() {
        System.out.println("Moo");
    }
}

 class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Cow());

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
