import java.util.Scanner;
public class  occurance {
    public static void main(String[] args) {
        int[] myarray = arrayUtility.inputArray();
        Scanner input = new Scanner(System.in);
        System.out.print("FIND THE number YOU WANT TOO FIND :");
        int element = input.nextInt();
        int repeat = repeat(myarray, element);
        System.out.println("occurance of  number " + element + "is :" + repeat + "times");

    }

    public static int repeat(int[] myarray, int element) {
        int i = 0, t = 0;
        while (i < myarray.length) {
            if (element == myarray[i]) {
                t++;
            }
            i++;
        }
        return t;

    }
}



