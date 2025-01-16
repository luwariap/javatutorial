import java.util.Scanner;

 public class armstrongNo {
     public static void main(String[] args) {
         System.out.print("please enter number :");
         Scanner input = new Scanner(System.in);
         int num = input.nextInt();
         boolean isArmstrong = isArmstrong(num);
         if (isArmstrong) {
             System.out.println("your number is  armstrongnumber ");
         } else {
             System.out.println("your number is not  armstrong no");
         }
     }

     public static boolean isArmstrong(int num) {
         int noofDigits = noofDigits(num);
         int num1, finalNo = 0;
         num1 = num;

         while (num1 > 0) {
             int lastdigit;
             lastdigit = num1 % 10;
             num1 /= 10;
             finalNo += pow(lastdigit, noofDigits);
         }

             return finalNo == num;

     }

     public static int noofDigits(int num) {
         int num1,digits = 0;
         num1=num ;
         while (num1 > 0) {
           num1 = num1 / 10;
             digits++;

                      }
         System.out.println("number of digits of "+num+"is "+digits);
         return digits;
     }


     public static int pow(int num1, int num2) {
         int result = 1;
         int i = 0;
         while (i < num2) {
             result = result * num1;
             i++;
         }
         System.out.println("power of " + num1 + " is " + result);
         return result;
     }
 }


