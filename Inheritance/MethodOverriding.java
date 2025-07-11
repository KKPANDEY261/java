class Animal {
   public void displayInfo() {
      System.out.println("I am an animal.");
   }

   public void display() {
      System.out.println("I am an Display Method.");
   }
}

class Dog extends Animal {
  // @Override
   public void displayInfo() {
      System.out.println("I am a dog.");
   }
}

class MethodOverriding {
   public static void main(String[] args) {
      Dog d1 = new Dog();
      d1.display();
      
      d1.displayInfo();
   }
}