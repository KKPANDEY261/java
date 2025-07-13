abstract class Bike{  
  abstract void run();  
}  
class AbstractMethod1 extends Bike{  
void run(){
    System.out.println("running safely");
    }  
public static void main(String args[]){  
 AbstractMethod1 obj = new AbstractMethod1();  
 obj.run();  
}  
}  