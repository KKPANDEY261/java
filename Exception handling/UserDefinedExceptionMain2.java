// A Class that represents use-defined exception
 
class MyException2 extends Exception {
}
 
// A Class that uses above MyException
public class UserDefinedExceptionMain2 {
    // Driver Program
    public static void main(String args[])
    {
        try {
            // Throw an object of user defined exception
            throw new MyException2();
        }
        catch (MyException2 ex) {
            System.out.println("Caught");
            System.out.println(ex.getMessage());
        }
    }
}