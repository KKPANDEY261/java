// Java code for thread creation by extending
// the Thread class
class CreateThread extends Thread {
    public void run()
    {
        try {
            // Displaying the thread that is running
            System.out.println(
                "Thread " + Thread.currentThread().getId()+ " is running");
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }}}
// Main Class
public class MultithreadMain {
    public static void main(String[] args)
    {
        int n = 8; // Number of threads
        for (int i = 0; i < n; i++) {
            CreateThread object= new CreateThread();
            object.start();
        }
    }
}