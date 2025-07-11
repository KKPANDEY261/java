// This is now correct.
class ThrowsErrorSolved {
static void throwOne() throws ArithmeticException {
System.out.println("Inside throwOne.");
throw new ArithmeticException("Ab ye bhasad tune khud se machai hai isme mera koi hath nhi hai");
}
public static void main(String args[]) {
try {
throwOne();
} catch (ArithmeticException e) {
System.out.println("Caught " + e);
}
}
}