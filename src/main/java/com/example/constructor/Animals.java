package com.example.constructor;
class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}
class PigDog extends Animal {
    public void animalSound(){
        System.out.println("The dog and the pig are mammal");
    }
}
class Chicken extends Animal {
    public void animalSound(){
        System.out.println("The chicken says: Pio pio");
    }
}
class Cat extends Animal {
    public void animalSound(){
        System.out.println("The chicken says: meow meow");
    }
}
class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}
public class Animals {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Create a Animal object
        Animal myPig = new Pig();  // Create a Pig object
        Animal myDog = new Dog();  // Create a Dog object
        Animal myTypeOfAnimal = new PigDog();
        Animal myChicken = new Chicken();
        Animal myCat= new Cat();
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
        myChicken.animalSound();
        myCat.animalSound();
        myTypeOfAnimal.animalSound();
    }
}

