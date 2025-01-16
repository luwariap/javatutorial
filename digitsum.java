 import java.util.Scanner ;
public class digitsum {
    public static void main(String[] args) {
        System.out.print("please enter number :");
        Scanner input = new Scanner (System.in);
        int num = input.nextInt();
        int sum  = sumofdigits(num);
        System.out.println("sum of digits of "+ num +" is "+ sum);
    }

    public static int sumofdigits(int num) {
     int sum = 0;
     while(num > 0) {
     sum = sum + num %10 ;
     num = num/10;
        }
        return sum ;
    }



}

