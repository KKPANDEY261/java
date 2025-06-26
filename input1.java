import java.util.Scanner;

public class input1 {

      public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        System.out.print("Provide your name:-");
        String name=scanner.nextLine();
        System.out.println("Provide your name:-");
        long name1=scanner.nextLong();
        System.out.println("hello my first name is "+name+" and your mobile number is "+name1);
        scanner.close();
        
      }
      
}
