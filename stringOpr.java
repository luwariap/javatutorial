 import com.sun.jdi.CharType;
 import java.util.Scanner;
public class stringOpr {
    public static void main(String[] args) {
        System.out.println("please enter your string with mixed case letters :");
        Scanner input = new Scanner(System.in);
        String text;
        text = input.next();
        for(int i = 0; i < text.length();i++) {
            char c = text.charAt(i);
            if(Character.isUpperCase(c)) {
                System.out.println();
                System.out.print(text.charAt(i) );
                            }
            else {
                System.out.print(text.charAt(i));
            }
          c = ' ';
        }
    }
}




