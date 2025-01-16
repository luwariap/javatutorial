public class ReverseArray {
    public static void main(String[] args) {
        System.out.println("swapping of array elemnet example ");
        int[] myArr = arrayUtility.inputArray();
        reverse(myArr);
        System.out.println(" here  is  your reversed array ");
        arrayUtility.displayArray(myArr);
    }

    public static void reverse(int[] arr) {
        int i = 0;
        int swap;
        while(i< (arr.length/2)) {
            swap = arr[i];
            arr[i] = arr[(arr.length-1)-i];
            arr[(arr.length-1)-i] = swap;
            i++;
        }

    }
}
