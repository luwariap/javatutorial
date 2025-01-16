import java.util.Scanner;
public class maxminarray {
    public static void main(String[] args) {
        int[] myarray = arrayUtility.inputArray();
        //Scanner input = new Scanner(System.in);
        //System.out.print("FIND THE maximum number in array :");
        //int element = input.nextInt();
        int max = max(myarray);
        int min = min(myarray);
        System.out.println("max of array element  is : "+max);
        System.out.println("min of array element  is : "+min);
    }
    public static int max(int[] myarray) {
        if (myarray.length == 0) {
            return Integer.MIN_VALUE;
        }
        int i = 1;
        int t = myarray[0];
        while (i < myarray.length) {
            if (t < myarray[i]) {
                t = myarray[i];
            }
            i++;
        }
        return t;
    }
    public static int min(int[] myarray) {
        int j=0;
        int t1 = Integer.MAX_VALUE;

        while(j<myarray.length) {
            if (t1 > myarray[j]) {
                t1 = myarray[j];
            }
            j++;
        }
        return t1;
    }
}
