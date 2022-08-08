package arrays.oneDimArr;

// Дан массив действительных чисел размером N.
// Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.
public class Task3 {
    public static void main(String[] args){
        final int N = 10_000;
        double[] arr = new double[N];
        OneDimArr.initDouble(arr);
        int cntPos = 0;
        int cntNeg = 0;
        int cntZero = 0;
        for (int i=0; i<N; i++){
            if (arr[i] > 0) {
                cntPos += 1;
            } else if (arr[i] < 0) {
                cntNeg += 1;
            } else {
                cntZero += 1;
            }
        }
        System.out.println("There are " + cntPos + " positive numbers in the array.");
        System.out.println("There are " + cntNeg + " negative numbers in the array.");
        System.out.println("There are " + cntZero + " zeros in the array.");
    }
}
