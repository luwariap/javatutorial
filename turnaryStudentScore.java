import java.util.Scanner;
 public class turnaryStudentScore {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("welcome to student scare and grading  example");
         System.out.print("please enter your marks :");
         int marks = input.nextInt();
         String category;
         if( marks <= 0 ) {
             System.out.println("your grading is very poor  ");
         }
         else {
             category = marks > 80 ? "HIGH" : (marks < 50 ? "LOW" : "MODERATE");
             System.out.println("your marks  are in category as :" + category);
         }

     }

 }