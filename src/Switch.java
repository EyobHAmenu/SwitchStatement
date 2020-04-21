import java.util.Scanner;

public class Switch {
    public static void main(String [] args)
    {

        int num_days;
        String month_name;

        Scanner sc = new Scanner(System.in);

        System.out.print("please enter number of days: ");
        num_days = sc.nextInt();

        switch (num_days){
            case 28: month_name = "February";
            case 29: month_name = "February";
                break;
            case 30: month_name = "April, June, September, November";
                break;
            case 31: month_name ="January, March, May, July, August, October, December";
                break;
            default : month_name = "Sorry no month have exactly " + num_days + " days. Please try again.";
                break;
        }
        System.out.println(month_name);
    }
}
