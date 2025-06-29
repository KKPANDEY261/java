public class Function {
    
    // Public methods (accessible from anywhere)
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    // Package-private methods (no 'public' keyword)
    int subtract(int a, int b) {
        return a - b;
    }

    int subtract(int a, int b, int c) {
        return a - b - c;
    }

    double subtract(double a, double b) {
        return a - b;
    }

    public static void main(String[] args) {
        Function calc = new Function();

        // Testing public add methods
        System.out.println("Public Methods:");
        System.out.println("add(2, 3) = " + calc.add(2, 3));
        System.out.println("add(2, 3, 4) = " + calc.add(2, 3, 4));
        System.out.println("add(2.5, 3.5) = " + calc.add(2.5, 3.5));

        // Testing package-private subtract methods
        System.out.println("\nPackage-Private Methods:");
        System.out.println("subtract(5, 2) = " + calc.subtract(5, 2));
        System.out.println("subtract(10, 3, 2) = " + calc.subtract(10, 3, 2));
        System.out.println("subtract(5.5, 2.2) = " + calc.subtract(5.5, 2.2));
    }

    
}
