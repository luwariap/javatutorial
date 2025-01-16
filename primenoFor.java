import java.util.Scanner;
public class primenoFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please  enter your  number :");
        int num = input.nextInt();
        boolean isPrime = isPrime(num);
        System.out.println("your number "+num+(isPrime(num)? " is Prime":" not prime"));
    }
    public static  boolean isPrime(int num ){
        for(int i=2; i<num;i++){
            if(num%i==0) {
                return false;
            }

        }
        return true;
    }
}
