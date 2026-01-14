package JavaCore;

class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal myPet = new Dog(); // Using dynamic polymorphism
        Dog dg = new Dog();
        dg.makeSound(); // Calls the Dog's makeSound method
        myPet.makeSound(); // Calls the Dog's makeSound method
        animal.makeSound();// Calls the Animal's makeSound method
     //   (Animal)myPet).makeSound(); // Calls the Dog's makeSound method

    }
}
