import java.util.Scanner;
public class lcm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter first no:");
        int first = input.nextInt();
        System.out.print("please enter second no:");
        int second = input.nextInt();
        int factor = lcmf(first, second);
        System.out.println("LCM of numbers " + first + "and " + second + " is" + factor);
    }

    public static int lcmf(int first, int second) {
        int i = 1;
        int factor = 1;
        while (i <= second) {
            factor = first * i;
            if ((factor % second) == 0) {
                return factor;
            }
            i++;
        }
        return 0;

    }


}
