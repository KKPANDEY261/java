class Animal {
    final void eat() {
        System.out.println("Animal eats");
    }
}
class Dog extends Animal {
    // void eat() {}  ❌ Compilation error: cannot override final method
}

public class nonvirtualmethod {
    
}
