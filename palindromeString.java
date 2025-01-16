    import java.util.Scanner;
import java.lang.String;
    public class palindromeString {
    static void main(String[] args) {
        System.out.print("please  enter string to check for palindrome :");
        Scanner input =new  Scanner(System.in);
         String str = input.next();
         System.out.println("your string is "+(ispalindrome(str) ? " Palindrome" : "not a  Plaindrome"));
    }


        public static boolean ispalindrome(String str) {
         int strlength =str.length();
        if(strlength <= 1) {
            return true;
        }
        int lastpos =str.length()-1;
        if(str.charAt(0)!=str.charAt(lastpos)){
            return false;
        }
        String newstr = str.substring(1,lastpos);
        return ispalindrome(newstr);
    }
}
