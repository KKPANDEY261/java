class ExceptionHandling2{
    public static void main(String args[]){
        int a=50;
        int b=0,c;
               try{ 
                c=a/b;
               }
                catch(ArithmeticException e){
                    System.out.println("Can not divide by zero.");
                    c=0;
                }
                System.out.println("a/b= "+c);
                
        System.out.println("After catch statement.");

    }
}