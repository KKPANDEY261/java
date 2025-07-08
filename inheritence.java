 // Parent class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class inheritence {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        
        myDog.eat();  // Inherited method from Animal
        myDog.bark(); // Dog's own method
    }
}
    

