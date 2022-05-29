
import java.util.*;

class Triangle {

    public static void main (String []args){
        Scanner scr = new Scanner(System.in);
        int d = scr.nextInt();
        int a,b,c,s ;
        a = 12;
        b = 15;
        c = 9;
        s = (a+b+c)/2;
        if(a+b>c && a+c>b && b+c>a){
            System.out.print("Area is:  ");
            System.out.println(Math.sqrt(s*((s-a)*(s-b)*(s-c))));
        }
        else{
            System.out.println("It is not possible to make a triangle using this value");
        }
    }
}
