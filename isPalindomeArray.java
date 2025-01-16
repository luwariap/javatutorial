public class isPalindomeArray {
    public static void main(String[] args) {
        int[] myArray = arrayUtility.inputArray();
       boolean isPalindome = isPalindome(myArray);
       if(isPalindome) {
            System.out.println("your array is  palindrome ");

        }
        else {
            System.out.println("your array is not palindrtome");

        }




    }

    public static boolean isPalindome(int[] myarr) {
        int i = 0;
        while (i < myarr.length/2) {
            if(myarr[i] != myarr[(myarr.length-1)-i]) {
                return false;
            }

            i++;
        }
        return true;
    }
}
