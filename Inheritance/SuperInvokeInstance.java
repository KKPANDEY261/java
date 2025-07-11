class Animal2{  
String color="white";  
}  
class Dog2 extends Animal2{  
String color="black";  
void printColor(){  
System.out.println(color);//prints color of Dog class  
System.out.println(super.color);//prints color of Animal class  
}  
}  
class SuperInvokeInstance{  
public static void main(String args[]){  
Dog2 d=new Dog2();  
d.printColor();  
}}  