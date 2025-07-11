// This program contains an error and will not compile.
class ThrowsError {
static void throwOne() {
System.out.println("Inside throwOne.");
 throw new ArithmeticException("Ab ye bhasad tune khud se machai hai isme mera koi hath nhi hai");
}
public static void main(String args[]) {
throwOne();
}
}