import java.util.Scanner;
    public class turnaryMin {
        public static void main(String[] args) {
            Scanner input = new  Scanner(System.in);
            System.out.println("welcome  to number  checker");
            System.out.print("please enter first number :");
            int num1 = input.nextInt();
            System.out.print("Please enter second number :");
            int num2 = input.nextInt();
            int minNumber = num1<num2 ? num1 : num2;
            System.out.println("miminum number is "+minNumber);

        }

}
