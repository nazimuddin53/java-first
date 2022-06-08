import java.util.*;

public class ReverseNumber{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value to reverse : ");
        int number = input.nextInt();
        int r = 0;
        while(number!=0){
            int reverse = number%10;
            r = r*10+reverse;

            number/=10;
        }
        System.out.println(r);
    }
}