class MyThread extends Thread {
    public void run() {
        // Code to be executed by the thread
        System.out.println("Thread is running: " + Thread.currentThread().getName());
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        MyThread t4 = new MyThread();
        MyThread t5 = new MyThread();
        t1.start(); // Starts a new thread
        t1.run();
        t2.run();
        t3.run();
        t4.run();
        t5.run();
        
        
    }
}