interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}


public class interfaces {
    public static void main(String[] args) {
        Dog obj=new Dog();
        obj.sound();
    }
}
