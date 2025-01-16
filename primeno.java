import java.util.Scanner;
public class primeno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter no:");
        int num = input.nextInt();
        System.out.println(+num);
        boolean isprimeno = isprimeno(num);
        if (isprimeno) {
            System.out.println("your number is  prime:" + num);
        }
         else{
             System.out.println("your number is not prime:"+num);
        }
    }

    public static boolean isprimeno(int num) {
        int i=2;
        while(i<num) {
            if (num % i == 0) {
                return false ;
            }
            i++;

        }
        return true;


    }

}
