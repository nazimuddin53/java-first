import java.util.*;
import java.text.SimpleDateFormat;

public class AgeCalculator{
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your birth Year: ");
        int birth_year = input.nextInt();
        System.out.print("\n Enter your birth month : ");
        int birth_month = input.nextInt();
        System.out.print("\n Enter your birth day : ");
        int birth_day = input.nextInt();

        SimpleDateFormat format_y = new SimpleDateFormat("yyy");
        SimpleDateFormat format_m = new SimpleDateFormat("MM");
        SimpleDateFormat format_d = new SimpleDateFormat("dd");

        Date date = new Date();
        String pyear = format_y.format(date);
        String pmonth = format_m.format(date);
        String pday = format_d.format(date);

        int p_year = Integer.parseInt(pyear);
        int p_month = Integer.parseInt(pmonth);
        int p_day = Integer.parseInt(pday);

        int year = p_year - birth_year;
        int month = p_month - birth_month;
        int day = p_day - birth_day;

        System.out.print(p_year+" "+p_month+" "+p_day);
        if(year>=0){
            if (year>=0&&month>=0&&day>=0){
                year = year;
                month = month;
                day = day;
            }
            else if((year>=0&&month<0&&day>=0)){
                year = year-1;
                month = month + 12;
                day = day;
            }
            else if(year>=0&&month>=0&&day<0){
                year = year;
                month = month -1;
                day = day + 30;
            }
            else if(year>=0&&month<0&&day<0){
                year = year -1;
                month = month + 11;
                day = day + 30;
            }
            System.out.println("Your age is "+year+" year / "+month+" month / "+day+" day ");
        }
        else{
            System.out.println("you are not born ");
        }



    }
}