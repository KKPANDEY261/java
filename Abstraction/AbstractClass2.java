//Example of an abstract class that has abstract and non-abstract methods  
 abstract class Bike2{  
   Bike2(){
    System.out.println("bike constructor is created");
    }  
   abstract void run2();  
   
   void changeGear2(){
    System.out.println("gear changed");
    }  
 }  

//Creating a Child class which inherits Abstract class  
 class Honda2 extends Bike2{  
 void run2(){
  System.out.println("running safely..");
  }  
 }  

//Creating a Test class which calls abstract and non-abstract methods  
 class AbstractClass2{  
 public static void main(String args[]){  
  Bike2 obj = new Honda2();  
  obj.run2();  
  obj.changeGear2();  
 }  
}  