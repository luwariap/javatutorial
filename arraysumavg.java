public class arraysumavg {
    public static void main(String[] args) {
        int[] numarray = arrayUtility.inputArray();
       double sum = sum(numarray);
        System.out.println("sum of all the  elements  is  :"+sum);
        System.out.println("average of all elements is : "+(sum/ numarray.length) );
    }

    public static double sum(int numarray[]) {
        int i = 0; double total = 0;
        while (i < numarray.length) {

            total = total + numarray[i];
            i++;

        }
        return total;



    }
}



