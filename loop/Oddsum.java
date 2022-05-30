import java.util.*;

public class Oddsum{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("enter a value : ");
        int n = input.nextInt();
        int sum = 0;
        while(n>=1){
            if(n%2!=0){
                System.out.print(" "+n);
                sum += n;
            }
            n--;
        }
        System.out.print("\nsum = "+sum);
    }
}