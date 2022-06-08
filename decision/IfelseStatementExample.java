import java.util.*;

public class IfelseStatementExample{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = input.nextInt();
        if (age>=18){
            System.out.print("Abulthood");
        }
        else{
            System.out.print("Not Adulthood");
        }
    }
}