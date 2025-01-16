public class sumofdigonals {
    public static void main(String[] args) {
        System.out.println("welcome to diagonals  sum example");
        int[][] newArr = arrayUtility.input2dArray();
        long sum = sumofdigonals(newArr);
        System.out.println("sum of diagonal is :"+sum);

    }

    public static long sumofdigonals(int[][] newArr) {
        long leftsumd = sumofLeftdigonals(newArr);
        long rightsumd =sumofRightdigonals(newArr);
        long sum = leftsumd + rightsumd ;
        if(newArr.length % 2 != 0) {
            int index = newArr.length / 2;
            sum -= newArr[index][index];
            return sum ;
        }
            return  sum ;
    }


    public static long sumofLeftdigonals(int[][] newArr) {
        int i = 0;
        int sumld = 0;
        while (i < newArr.length) {
            sumld += newArr[i][i];
            i++;
        }
        return sumld;
    }
    public static long sumofRightdigonals(int[][] newArr) {
        int i = 0;
        int sumrd = 0;
        while (i < newArr.length) {
            int col = (newArr.length-1-i);
            sumrd += newArr[i][col];
            i++;
        }
        return sumrd;
    }
}
