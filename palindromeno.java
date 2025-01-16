import java.util.Scanner;
public class palindromeno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,totaldigits = 0;
        System.out.print("please enter your number : ");
        num = input.nextInt();
        System.out.println(num);
        totaldigits = totaldigits(num);
        System.out.println("no of digits of "+num+" is "+totaldigits);
        int reverse = reverse(num ,totaldigits);
        boolean isPalindrome ;
        isPalindrome = isPalindrome(num,reverse);
        if ( isPalindrome) {
            System.out.println("your number is  palindrome");
        }
        else {
            System.out.println("your number is  not plaindrome");
        }

    }

    private static boolean isPalindrome(int num,int reverse) {
              return num == reverse ;
    }

public static int totaldigits(int num ) {
    int num1 = num , digits=0 ;
    while(num1>0) {
           num1 = num1 / 10;
           digits++ ;

    }
    return digits;
}

public static int reverse(int num,int totaldigits) {
    int finalno = 0;
        while (num>0) {
        int digit = num % 10;
        finalno = finalno*10 + digit ;
        num = num / 10;
            }
    return finalno;
}



}
