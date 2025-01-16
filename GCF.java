import java.util.Scanner;
public class GCF {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("GCF example ");
        System.out.print("pleas enter FIRST NO :");
        int first = input.nextInt();
        System.out.print("pleas enter second NO :");
        int second = input.nextInt();
        int gcf = gcf( first, second);
        System.out.println("GCF is:"+gcf);
    }
    public static int gcf(int num1,int num2) {
        int i = 2, gcf = 1, least;
        least = least(num1, num2);
        while (i <= least) {
            if ((num1 % i == 0) && (num2 % i == 0)) {
                gcf = i;

            }

            i++;

        }


        return gcf;
    }


    public static int least(int num1,int num2) {
         if (num1 < num2) {
            return num1;
         }
            else {
                return num2;
            }

    }

}
