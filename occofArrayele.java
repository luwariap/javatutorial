import java.util.Scanner ;
public class occofArrayele {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] myArray = arrayUtility.inputArray();
        System.out.print("please enter number you want to search in array :");
        int element = input.nextInt();
        int occ = occurance(myArray, element);
        System.out.println("occurance of number " + element + "  in array is  " + occ + " times ");
    }
    public static int occurance(int[] myArray, int element) {
        int occ = 0;
        for (int num: myArray) {
            if (num == element) {
                occ++;
            }

        }
        return occ;
    }
}


