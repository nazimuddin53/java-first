import java.util.*;

public class IfstatementExample{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = input.nextInt();
        if(age>=18){
            System.out.println("Adulthood");
        }
    }
}