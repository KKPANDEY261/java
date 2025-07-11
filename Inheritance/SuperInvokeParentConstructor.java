class Animal4{  
Animal4(){
    System.out.println("animal is created");}  
}  
class Dog4 extends Animal4{  
Dog4(){  
super();  
System.out.println("dog is created");  
}  
}  
class SuperInvokeParentConstructor{  
public static void main(String args[]){  
Dog4 d=new Dog4();  
}}  