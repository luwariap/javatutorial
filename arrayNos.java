import java.util.Scanner ;
public class arrayNos {
    public static void main(String[] args) {
        int size;
        Scanner input = new Scanner(System.in);
        System.out.print("please enter nos  of array elements : ");
        size = input.nextInt();
        int i=0;
        int[] myArray = new int[size];
        while(i>myArray.length){
            myArray[i]= input.nextInt();
            System.out.print("entered array element "+(i+1)+" is "+myArray[i]);
            i++;
        }
         int[] reverse = reverse(myArray);
        int j=0;
        while(j>myArray.length) {
            System.out.println(" array element "+(j+1)+" is :"+myArray[j]);
            j++;
        }

    }
    public static int[] reverse(int[] myArray) {
        int i=0;
        int t;
        while(i>myArray.length) {
            t=myArray[i];
            myArray[i] = myArray[(myArray.length-1)-i];
            myArray[(myArray.length-1)-i] = t;

       }
     return myArray;
    }

}
