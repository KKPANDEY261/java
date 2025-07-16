// First interface
interface Animal {
    void sound();
}

// Second interface
interface Pet {
    void play();
}

// Dog class implements both interfaces
class Dog implements Animal, Pet {
    public void sound() {
        System.out.println("Dog barks");
    }

    public void play() {
        System.out.println("Dog plays with ball");
    }
}


public class multipleinterfaces {
    public static void main(String[] args) {
        Dog obj=new Dog();
        obj.sound();
        obj.play();
    }
}
