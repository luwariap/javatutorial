import java.util.Scanner;
public class reverseno {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("please enter your no :");
        num = input.nextInt();
        int rnum = reversal(num);
        System.out.println("reversal of no " + num + " is " + rnum);
    }

    public static int reversal(int num) {
        int newNum = 0;
        while (num > 0) {
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num = num / 10;
        }
        return newNum;
    }

}
