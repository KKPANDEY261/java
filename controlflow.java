import java.lang.classfile.instruction.StoreInstruction;

public class controlflow {
    public static void main(String[] args) {
    int Score=88;
    String Grade;
    String Status;
    
    if (Score >= 90){
        Grade="A";
    }
    else if (Score >= 70){
        Grade="B";
    }
    else if (Score >= 50){
        Grade="C";
    }
    else if (Score >=30){
        Grade="D";
    }
    else {
        Grade="E";
    }

    switch (Grade){
        case "A":
                 Status="Excelent";
                 break;
        case "B":
                 Status="Very Good";
                 break;
        case "C":
                 Status="Good";
                 break;
        case "D":
                 Status="Poor performance";
                 break;
        default :
                 Status="Failed";
                 break;
    }

    System.out.println("Score :-"+Score);
    System.out.println("Grade :-"+Grade);
    System.out.println("Status :-"+Status);
    String ternory=(Score <=30)? "you are failed":"Check your Status";
    System.out.println(ternory);

    }
}
