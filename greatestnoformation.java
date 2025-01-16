import java.util.Scanner;
public class greatestnoformation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] myArr = arrayUtility.inputArray();
        greatest(myArr);
    }

    public static void greatest(int[] numsArray) {
        int i = 0;
        int swap = 0;
        while (i < numsArray.length) {
            if ((i + 1) < numsArray.length) {
                break;
            } else {
                if (numsArray[i] < numsArray[i + 1]) {
                    swap = numsArray[i];
                    numsArray[i] = numsArray[i + 1];
                    numsArray[i + 1] = swap;
                }
            }
            i++;
        }
        System.out.println("array element sorting done");
        System.out.print("greatest number formed is  :");
        int j = numsArray.length - 1;
        while (j < numsArray.length) {
            if (j < 0) {
                break;
            }
            System.out.print(numsArray[j]);
            j = j - 1;
        }
    }
}



