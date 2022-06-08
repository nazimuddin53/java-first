import java.util.*;

public class NestedIfExample{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int a = input.nextInt();
        if(a>1){
            if(a<3){
                System.out.print("a = "+a);
            }
        }
    }
}