import java.util.Scanner;
    public class arrayrev{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter nos  of array elements : ");
        int size = input.nextInt();
        int[] myArray = new int[size];
        int i =0;
        while(i< size) {
            System.out.print("entered array element " +(i+1)+" is : ");
            myArray[i] = input.nextInt();
            i++;
        }

       reverse(myArray);
    }

      public static void reverse(int[] newarr) {
        int i = 0;
         int swap;
        while (i < newarr.length / 2) {
            swap = newarr[i];
            newarr[i] = newarr[(newarr.length - 1 - i)];
            newarr[(newarr.length - 1 - i)] = swap;
            i++;
        }
        System.out.println("reverse of array elments is :");
        int j = 0;
        while (j < newarr.length) {
            System.out.print(" array element " + (j + 1) + " is :" + newarr[j]);
            System.out.println();
            j++;
        }
    }
}
