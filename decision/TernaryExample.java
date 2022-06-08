import java.util.*;

public class TernaryExample{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Entar value a = ");
        int a = input.nextInt();
        System.out.print("Entar value b = ");
        int b = input.nextInt()  ;
        System.out.print(a>b?"a greater then b":"a less then b");
    }
}