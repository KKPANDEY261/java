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
    System.out.println(Math.pow(2, 30)); //output 25   exponentation method


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

    //logical operator
       System.out.println("logical AND:-"+(55==55 && 66>56));     //output    logical AND:-true
        System.out.println("logical AND:-"+(55==55 && 66<56));   //output    logical AND:-false
        System.out.println("logical OR:-"+(55==55 || 66<56));   //output    logical OR:-true
         System.out.println("logical OR:-"+(55==55 || 66>56)); //output    logical OR:-true
          System.out.println("logical NOT:-"+(!(55==55)));    //output    logical NOT:-false


    //Bitwise operator
       System.out.println("Bitwise AND:-"+(5&6));     //output  Bitwise AND:-4
       System.out.println("Bitwise OR:-"+(5|6));     //output  Bitwise OR:-7
       System.out.println("Bitwise XOR:-"+(5^6));   //output  Bitwise XOR:-3
       System.out.println("Bitwise NOT:-"+(~5));   //output  Bitwise NOT:--6
       System.out.println("Bitwise Left Shift:-"+(5<<2));  //output Bitwise Left Shift:-20
       System.out.println("Bitwise Right Shift:-"+(15>>2));  //output Bitwise Right Shift:-3
       System.out.println("Bitwise Unsigned Right Shift:-"+(-5>>>1)); //output Bitwise Unsigned Right Shift:-2147483645

    //Ternary Operator
      String m=(5>3)? "hello": "Welcome";
      String n=(5<3)? "hello": "Welcome";
       System.out.println("Ternary:-"+ m);    // output Ternary:-hello
       System.out.println("Ternary:-"+ n);   // output Ternary:-Welcome

    //String operator 
        System.out.println("Hello "+"my "+"name "+"is "+"Pandey" );  //output Hello my name is Pandey
    

    //instanceof Operator
           String s = "Hello";
             boolean result = s instanceof String; 
             System.out.println(result);     // output true

    
    }
    
}
