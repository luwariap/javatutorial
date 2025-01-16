import java.util.Scanner ;
public class numtodelfromarray {
    public static void main(String[] args) {
        int[] myarray = arrayUtility.inputArray();
        Scanner input = new Scanner(System.in);
        System.out.print("please enter number you want to delete from array:");
        int numbertodel = input.nextInt();
        int occ = occurances(myarray, numbertodel);
        int[] myarray =  deleteno(myarray,numbertodel,occ);
        System.out.println("here is your new array ");
        arrayUtility.displayArray(myarray);
    }
    public static int occurances(int[] myArr, int num1) {
        int i = 0, j = 0;
        while(i< myArr.length) {
            if(myArr[i] == num1) {
                j++;
            }
            i++;
        }
        System.out.println(j);
        return j;
    }

    public static int[] deleteno(int[] myarr, int num1, int occ1) {
        if (occ1 == 0) {
            return myarr;

        }
        else {
            int newsize = myarr.length - occ1;
            int[] modarray = new int[newsize];
            int i = 0, j = 0;
            while (i < myarr.length) {
                if(myarr[i] != num1) {
                    modarray[j] = myarr[i];
                    j++;
                    System.out.print(modarray[j]+"  ");
                }
                i++;
            }
            return modarray;
        }
    }


}






