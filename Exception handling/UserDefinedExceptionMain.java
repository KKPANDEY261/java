// A Class that represents use-defined exception

class MyException extends Exception {
	public MyException(String s)
	{
		// Call constructor of parent Exception
		super(s);
	}
}

// A Class that uses above MyException
public class UserDefinedExceptionMain {
	// Driver Program
	public static void main(String args[])
	{
		try {
			// Throw an object of user defined exception
			throw new MyException("Ye rayta hamne khud failaya hai");
		}
		catch (MyException ex) {
			System.out.println("Exception Caught");
            System.out.println("Hamne apna failaya rayta samet liya hai");
			// Print the message from MyException object
			System.out.println(ex.getMessage());
		}
	}
}
