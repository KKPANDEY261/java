public class operator {
    public static void main(String[] args) {
    //Arithmatic operator in java
        int a,b,c;
        a=10;
        b=20;
        c=25;
    System.out.println("Addition:-"+(a+b));       //Output:- 30
    System.out.println("Substraction:-"+(b-a));       //Output:- 10
    System.out.println("Multiplication:-"+(a*b));       //Output:- 200
    System.out.println("Division:-"+(b/a));       //Output:- 2
    System.out.println("Modulus:-"+(c%a));       //Output:- 5
    System.out.println("Post Increment:-"+(a++));       //Output:- 10
    System.out.println("Post Decrement:-"+(a--));       //Output:- 11
    System.out.println("Pre Increment:-"+(++a));       //Output:- 11
    System.out.println("Pre Decrement:-"+(--a));       //Output:- 10


    //Assignment operator 

    int d,e,f,g,h,i;
    d=10; e=20; f=30; g=40; h=50; i=10;  // Assign operator
    d+=e;   //  Add and Assign
    e-=d;   //  Subtract and Assign	
    f*=d;   //  Multiply and Assign
    g/=i;   //  Divide and Assign
    h%=3;   //  Modulus and Assign
    System.out.println(d);   // output   30
    System.out.println(e);   // output   -10
    System.out.println(f);   // output   900
    System.out.println(g);   // output   4
    System.out.println(h);   // output   2


    //  Relational/Comparision  Operators 
    
        int j,k,l;
         j=20; k=20; l=30;
         System.out.println(j==k);     // output    true
         System.out.println(j==l);     // output    false
         System.out.println(j!=k);     // output    false
         System.out.println(j!=l);     // output    true
         System.out.println(j>k);     // output    false
         System.out.println(k>j);     // output    false
         System.out.println(j>l);     // output    false
         System.out.println(j<k);     // output    false
         System.out.println(k<j);     // output    false
         System.out.println(j<l);     // output    true
         System.out.println(j>=k);     // output    true
         System.out.println(k>=j);     // output    true
         System.out.println(j>=l);     // output    false
         System.out.println(j<=k);     // output    true
         System.out.println(k<=j);     // output    true
         System.out.println(j<=l);     // output    true



    
    }
    
}
