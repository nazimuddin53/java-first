import java.util.*;

public class Evensum{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int n = input.nextInt();
        int sum = 0;
        while(1<=n){
            if(n%2==0){
                sum += n;
                System.out.print(" "+n );
            }
            n--;
        }
        System.out.print( "\n sum = "+sum);
    }
}