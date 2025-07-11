class TestThrow2{
    public static void main(String args[]){
        int a=50;
        int b=1,c;
               try{ 
            c=a/b;
            throw new ArithmeticException("Abe andha hai kya... bola na tere ko.. zero se divison nhi hoga");
                //System.out.println("Chal ab ye line print nhi hoga");
               }
                catch(ArithmeticException e){
                    System.out.println("Can not divide by zero.");
                    c=0; System.out.println("Exception is: "+e);
                }
                System.out.println("a/b= "+c);
                
        System.out.println("After catch statement.");

    }
}