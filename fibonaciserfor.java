   import java.util.Scanner ;
   public class fibonaciserfor {
    public static void main(String[] args) {
        System.out.print("please enter  fibonaci series  last number :");
        Scanner input = new Scanner(System.in);
        int laststep = input.nextInt();
        System.out.print("list of fibonacci series numbers to be printed : "+laststep);
        System.out.println();
        for(int i=1;i<= laststep;i++) {
            System.out.print(fibonacci(i)+"  ");
        }
    }
       public static int fibonacci(int laststep) {
        if(laststep == 1) {
            return 0;
        }
         if (laststep == 2) {
            return 1;
        }
         return fibonacci(laststep-1)+fibonacci(laststep-2);
        }


}
