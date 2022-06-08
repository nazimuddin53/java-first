import java.util.*;

public class IfelseifStatementExample{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = input.nextInt();
        if(age<10){
            System.out.print("Child");
        }
        else if(age<18&&age>=10){
            System.out.print("Tenager");
        }
        else{
            System.out.print("Adulthood");
        }
    }
}