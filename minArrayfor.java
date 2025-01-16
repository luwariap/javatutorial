public class minArrayfor {
    public static void main(String[] args) {
        int[] myArray = arrayUtility.inputArray();
        int minele  = minele(myArray) ;
        System.out.println("minimum element of your  array  is "+minele);

    }
    public static  int minele(int[] myArray){
        int min = myArray[0];
        for(int i=0; i<myArray.length;i++) {
            if(myArray[i]<min) {
                min = myArray[i] ;
            }
        }
        return min;
    }

}


