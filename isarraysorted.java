public class isarraysorted {
    public static void main(String[] args) {
        int[] myarray = arrayUtility.inputArray();
        //Scanner input = new Scanner(System.in);
        //System.out.print("FIND THE maximum number in array :");
        //int element = input.nextInt();

        boolean isinc = isinc(myarray);
        boolean isdec = isdec(myarray);

        if(isinc || isdec){
        System.out.println(" array elements are sorted ");
        }
        else  {
            System.out.println("array elements are not sorted ");
        }
    }

    public static boolean isdec(int[] myarray) {
        int j=1;
        while(j<myarray.length) {
            if (myarray[j] > myarray[j-1]) {
                return false ;
            }
            j++;
        }
        return true;
    }



    public static boolean isinc(int[] myarray) {
        int j=1;

        while(j<myarray.length) {
            if (myarray[j] < myarray[j-1]) {
                return false ;
            }
            j++;
        }
        return true;
    }
}


