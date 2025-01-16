
import java.util.Scanner ;
public class absNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter number ");
        int num = input.nextInt();
        int numAbs = num >0 ? num : (-num);
        System.out.println("absolute of youe number is "+numAbs);

    }
}
