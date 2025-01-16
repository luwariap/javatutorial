import java.util.Scanner;
public class newreverse {
    public static void main(String[] args) {
         int num;
         Scanner input = new Scanner(System.in);
        System.out.print("please enter number :");
         num = input.nextInt();
         //int noofDigits = noofDigits(num);
         int numreverse = numreverse(num) ;
        System.out.println(" reverse number is :"+numreverse);
    }
    public static int numreverse(int num) {
        int  newnum = 0 ;
        int num1 = num ;
        while (num1>0) {
            int digit ;
            digit = num1 % 10;
            newnum =newnum*10 +digit ;
            num1 =num1/10;
        }
        return newnum;
    }
}
