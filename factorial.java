import java.util.Scanner ;
 public class factorial {
    public static void main(String[] args) {
        System.out.print("please enter number :");
        Scanner input = new Scanner (System.in);
        int num = input.nextInt();
        long fact = Factor(num);
        System.out.println("factorial of number "+num+" is "+fact);
    }

    public static long Factor(int num) {

     if(num < 2) {
         return 1;
      }
     int i = 2 ;
      long fact = 1;
       while(i <= num) {
           fact *=  i;
           i++ ;

       }
        return fact;
    }



}
