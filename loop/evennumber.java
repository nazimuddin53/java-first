public class Evennumber{
    public static void main(String args[]){
        int sum = 0;
        for(int j=0;100>j;j++){
        for(int i = j;i%2==0;i++){
            System.out.print(" "+i);
            sum += i;
        }}
        System.out.print("\n"+sum);
    }
}