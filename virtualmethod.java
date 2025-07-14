 class Animal {
    public void makeSound() {  // This is a virtual method
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {  // This method will be called at runtime
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {  // This method will be called at runtime
        System.out.println("Cat meows");
    }
}

public class virtualmethod {
   
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();    // Parent reference, Child object
        Animal myCat = new Cat();    // Parent reference, Child object
        
        myAnimal.makeSound();  // Calls Animal's method
        myDog.makeSound();     // Calls Dog's method at runtime (virtual method dispatch)
        myCat.makeSound();     // Calls Cat's method at runtime (virtual method dispatch)
    }
}

