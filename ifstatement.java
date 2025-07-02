import java.util.Scanner;

public class ifstatement {
    public static void main(String[] args) {
        Scanner scanner =new Scanner (System.in);
        System.out.print("Enter your Score :-");
        int Score=scanner.nextInt();

        if (Score >=90){
            System.out.println("Excelent");
        }
        else if (Score >=70){
            System.out.println("Very Good");
        }
        else if (Score >= 50){
            System.out.println("Good");
        }
        else if (Score >=30){
            System.out.println("Poor Performence");
        }
        else {
            System.out.println("You are faliled");
        }
    }
}
