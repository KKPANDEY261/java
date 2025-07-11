class Animal3{  
void eat()
{System.out.println("eating...");}  
}  
class Dog3 extends Animal3
{  
void eat(){
    System.out.println("eating bread...");}  
void bark(){
    System.out.println("barking...");}  
void work()
{  
eat();
super.eat();  
bark();  
}  
}  
class SuperInvokeParentMethod{  
public static void main(String args[]){  
Dog3 d=new Dog3();  
d.work();  
}}  