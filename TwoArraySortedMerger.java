public class TwoArraySortedMerger {
    public static void main(String[] args) {
        System.out.println("welcome two sorted array merging example");
        int[] arr1 = arrayUtility.inputArray();
        int[] arr2 = arrayUtility.inputArray();
        int[] mergeArray = merger(arr1,arr2);
        System.out.println("here is your mergred sorted array");
        arrayUtility.displayArray(mergeArray);
    }

    public static int[] merger(int[] arr1, int[] arr2) {
        int i=0,j =0,k=0 ;
        int newSize = arr1.length+arr2.length;
        int[] newArr = new int[newSize];
              while(i<arr1.length || j < arr2.length) {
                  if(j== arr2.length || (i< arr1.length && arr1[i] < arr2[j])) {
                      newArr[k] = arr1[i];
                      i++;
                      k++;
                  }
                  else {
                      newArr[k] = arr2[j];
                      k++;
                      j++;
                  }
                  }
        return newArr ;

    }

}
