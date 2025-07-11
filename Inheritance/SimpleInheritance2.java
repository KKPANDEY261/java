//Base Class
class A1 {
static int i=10, j=20;
static void showij() {
System.out.println("i and j: " + i + " " + j);
}
}

// Create a subclass by extending class A.

class SimpleInheritance2 extends A1 {
public static void main(String args[]) {
System.out.println("i is: "+i);
System.out.println("j is: "+j);
showij();
}
}