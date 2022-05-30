import java.util.*;

public class FibonacciNumber{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("enter a value : ");
        int n = input.nextInt();
        int a = 0,b = 1;

        for (int i = 1;i<=n;i++){
            int c = a + b;
            System.out.print(" "+c);
            a = b;
            b = c;
        }
    }
}