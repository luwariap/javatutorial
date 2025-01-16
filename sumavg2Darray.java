import java.util.Scanner;
public class sumavg2Darray {
    public static void main(String[] args) {
            System.out.println("welcome 2D array element sum average Example ");
            int[][] numArr = arrayUtility.input2dArray();
            Scanner input = new Scanner(System.in);
            long sum = sum2Darray(numArr);
        System.out.println("sum of all elements  of 2D array is: "+sum);
        int total = numArr.length;
        double avg = avg2Darray(numArr);
        System.out.println("average of all elements  of 2D array is: "+avg);

            }

        public static long sum2Darray(int[][] newArr) {
            int i = 0;
            int sum = 0;
            while (i < newArr.length) {
                int j = 0;
                while (j < newArr[i].length) {
                    sum += newArr[i][j];
                    j++;
                }
                i++;
            }
            return sum;
        }

    public static double avg2Darray(int[][] newArr) {
        int rows = newArr.length;
        double avg1=0;
        if (newArr.length == 0) {
            System.out.println("your array elements  avergae is  0");
        }
        else  {
            int rows1 = newArr.length;
            int cols1 = newArr[0].length ;
            double size = rows1*cols1;
            double sum1 = sum2Darray(newArr);
             avg1 = sum1/size;
        }
             return avg1;
    }

}
