// importing the java.lang package  
import java.lang.*;  
  
public class ThreadPriority2 extends Thread   
{     
public void run()  
{  
// the print statement  
System.out.println("Inside the run() method");  
}   
public static void main(String argvs[])  
{  
 
Thread.currentThread().setPriority(7);  
System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());  
  
ThreadPriority2 th2 = new ThreadPriority2();  
System.out.println("Priority of the thread th1 is : " + th2.getPriority());  
}  
} 