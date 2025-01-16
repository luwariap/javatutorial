import java.util.Scanner ;
public class sumpositivenosevencontinue {
    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);
        int[] numsarray = arrayUtility.inputArray();
        int  total = sum(numsarray);
        int eventotal = esum(numsarray);
        System.out.print("sum of positive nos is  :"+total);
        System.out.println();
        System.out.print("sum of even nos is  : "+eventotal);
    }
    public static int sum(int[] numsarray) {
        int result = 0;
        for (int i = 0; i < numsarray.length; i++) {
            if (numsarray[i] < 0) {
                continue;
            } else {
                result += numsarray[i];
            }

        }
        return result;
    }
    public static int esum(int[] numsarray) {
        int result = 0;
        for (int i = 0; i < numsarray.length; i++) {
            if (numsarray[i] % 2 == 0) {
                result += numsarray[i];

            } else {
                continue;
            }

        }
        return result;
    }

}
