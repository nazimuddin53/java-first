public class Oddnumber{
    public static void main(String... args){
        int sum = 0;
        for (int i = 1;i<100;i++){
            for (int j = i;j%2!=0;j++){
                System.out.print(" "+j);
                sum += j;

            }
        }System.out.print("\n "+sum);
    }
}