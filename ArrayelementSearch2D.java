import java.util.Scanner ;
public class ArrayelementSearch2D {
    public static void main(String[] args) {
        System.out.println("welcome 2D array element serach Example ");
        int[][] numArr = arrayUtility.input2dArray();
        Scanner input = new Scanner(System.in);
        System.out.println("please enter number you want to search :");
        int num = input.nextInt();
        boolean isFound = search(numArr,num) ;
        if(isFound) {
            System.out.println("your number is found in array");
        }
        else {
            System.out.println("your number is not found in  array");
        }
    }

    public static boolean search(int[][] newArr, int num) {
        int i = 0;
        while (i < newArr.length) {
            int j = 0;
            while (j < newArr[i].length) {
                if(newArr[i][j] == num) {
                    System.out.printf("element found in %d row and %d  column ",(i+1),(j+1));
                    return true;
                }
                j++;
            }
            i++;
        }
        return false ;
    }
}
