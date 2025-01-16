
import java.util.Scanner ;
public class oddevenTurnary {
    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);
        System.out.println("welcome number check odd or even ");
        System.out.print("please enter number :");
        int num = input.nextInt();
         String numCheck = (num%2==0) ? "even" :"odd" ;
        System.out.println(num+" is a  "+numCheck+" number");






    }
}
