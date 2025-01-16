public class maxArray {
    public static void main(String[] args) {
        int[] myArray = arrayUtility.inputArray();
        int maxele  = maxele(myArray) ;
        System.out.println("max element of your  array  is "+maxele);

    }
    public static  int maxele(int[] myArray){
        int max = myArray[0];
        for(int i=0; i<myArray.length;i++) {
            if(myArray[i]>max) {
                max = myArray[i] ;
            }
        }
        return max;
    }

}
