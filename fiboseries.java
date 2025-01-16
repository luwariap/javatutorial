import java.util.Scanner ;
public class fiboseries{
    public static void main(String[] args) {
        System.out.print("please enter number where fibo series end :");
        Scanner input = new Scanner (System.in);
        int num = input.nextInt();
        System.out.println("fibonaci series  from 1 to"+ num +" is ");

         series( num );

    }

    public static void series(int num) {
         if (num <= 0) {
             System.out.println(0); }
            else if (num ==1) {
             System.out.println(1); }
          else {
             int firstNo = 0, secondNo = 1, thirdNo;
              while ((firstNo + secondNo)<=num) {
                  thirdNo = firstNo + secondNo;
                  System.out.print(thirdNo+" ");
                  firstNo = secondNo;
                  secondNo = thirdNo;
              }

         }


    }



    }
