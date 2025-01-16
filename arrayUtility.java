import java.util.Scanner ;
public class arrayUtility {
    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("pl enter total  no of array elements :");
        int size = input.nextInt();
        int[] nums = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("pl  enter array element no " + (i + 1)+ ": ");
            nums[i] = input.nextInt();
            i++;
        }
        return nums;
    }
    public static int[][] input2dArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter no of rows :");
        int rows = input.nextInt();
        System.out.print("please enter no of column :");
        int columns = input.nextInt();
        int[][] numArray = new int[rows][columns];
        int i=0;
        while(i < rows) {
            int j=0;
            while (j < columns) {
                System.out.println("array element rows " +(i + 1)+
                        ",column : "+(j + 1)+ " : ");
                numArray[i][j] = input.nextInt();
                j++;
            }
            i++;
        }

        return numArray;

    }

    public static void displayArray(int[] newArr) {
        int j = 0;
        while(j< newArr.length) {
            System.out.print(newArr[j]+"  ");
            j++;
        }
        System.out.println();

    }

}





