import java.util.*;

public class Primenum{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a value : ");
        int n = input.nextInt();
        int m = n/2,a=0;
        for(int i = 2;i<=m;i++){
        if(n%i==0){
                System.out.println(n+" is not prime number");
                a = 1;
                break;
            }
        }
        if(a==0){
                System.out.println(n+" is prime number");

        }
    }
}