
import java.util.Scanner;
public class yearswitch {
    public static void main(String[] args) {
        String monthname;
        int monthNum;
        Scanner input = new Scanner(System.in);
        System.out.print("please enter month number :");
        monthNum = input.nextInt();
        String month = monthName(monthNum);
        System.out.println("your monthnum :" + monthNum + " name is : " + month);
    }

    public static String monthName(int monthNum) {
        return switch (monthNum) {
            case 1 -> "Januray";
            case 2 -> "february";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "may";
            case 6 -> "june";

            case 7 -> "July";

            case 8 -> "february";

            case 9 -> "september";

            case 10 -> "october";

            case 11 -> "november";
            case 12 -> "December";
            default -> "your monthnumber  is not between 1 to 12  ";
        } ;
           }
}
