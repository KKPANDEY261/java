class Animal5 {
  Animal5() {// default or no-arg constructor
    System.out.println("I am an animal");
  }
Animal5(String type) {// parameterized constructor
    System.out.println("Type: "+type);
  }
}

class Dog5 extends Animal5 {
Dog5() {// default constructor
     // calling parameterized constructor of the superclass
  super("Animal");
   System.out.println("I am a dog");
  }
}
class SuperParaConstructor {
  public static void main(String[] args) {
    Dog5 dog1 = new Dog5();
  }
}