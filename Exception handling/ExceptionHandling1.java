class ExceptionHandling1{
    public static void main(String args[]){
        try {   int a=50;
                int b=0;
                int c=a/b;
                System.out.println("a/b= "+c);
                }
                catch(ArithmeticException e){
                    System.out.println("Division by zero.");
                }
        System.out.println("After catch statement.");

    }
}