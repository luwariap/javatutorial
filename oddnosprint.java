 import java.util.Scanner;

public class oddnosprint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter number :");
        int num = input.nextInt();
        System.out.println(series(num));

    }

    public static double series(int num) {
        int i = 1;
                double sum = 0;

        if (!(num % 2 == 0)) {
            for (i = 1; i <= num; ) {
                sum = sum + i;
                i = i + 2;


            }
        } else {
            for (i = 1; i <= (num - 1); ) {
                sum = sum + i;
                i = i + 2;
            }
        }
        return sum;
    }
    }