class CreateThreadByThreadClass extends Thread{  
public void run(){  
System.out.println("thread is running...");  
}  
public static void main(String args[]){  
CreateThreadByThreadClass t1=new CreateThreadByThreadClass();  
t1.start();  
 }  
}  