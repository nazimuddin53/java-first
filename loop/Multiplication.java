import java.util.*;

public class Multiplication{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.print("ender a value : ");
            int a = input.nextInt();
            System.out.println("Multiples of  "+a);
            for(int i = 1;i<=10;i++){

                System.out.println(a+" x "+i+" = "+a*i);

            }

        }

    }
}