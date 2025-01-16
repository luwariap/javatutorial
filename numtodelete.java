import java.util.Scanner ;
public class numtodelete {
    public static void main(String[] args) {
        int[] myarray = arrayUtility.inputArray();
        Scanner input = new Scanner(System.in);
        System.out.println("pl enter element you want to delete :");
        int numtodelete = input.nextInt();
        System.out.println("here is your new  array   as  :");
        int[] newArr = deleteNum(myarray,numtodelete);
        arrayUtility.displayArray(newArr);


    }

    public static int[] deleteNum(int[] myarray,int numtodelete) {
        int occ = occurance.repeat(myarray, numtodelete);
        if (occ == 0) {
            System.out.println(" array elements  are o or  your entered element is not in array");
            return myarray;
        }
        int newSize = myarray.length - occ;
        int[] newArray = new int[newSize];
        int i = 0, j = 0;
        while (i < myarray.length) {
            if (myarray[i] != numtodelete) {
                newArray[j] = myarray[i];
                j++;
            }
            i++;

        }

    return newArray ;
   }
}
