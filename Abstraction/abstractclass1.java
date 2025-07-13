// Abstract class
abstract class Animal {
    // Abstract method (no body)
    abstract void sound();

    // Non-abstract method (with body)
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

// Subclass (inherits abstract class)
class Dog extends Animal {
    // It is mandatory to implement the abstract method
    void sound() {
        System.out.println("Dog barks");
    }
}

public class abstractclass1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();  // Output: Dog barks
        d.sleep();  // Output: Animal is sleeping
    }
}
