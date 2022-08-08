package arrays.oneDimArr;

// Даны действительные числа a1, a2,...,a2N.
// Найти max(a1+a2N, a2+a2(N-1),..., aN+a(N+1)
public class Task7 {
    public static void main(String[] args){
        final int SIZE = 10;
        int[] arr = new int[SIZE];
        OneDimArr.initInt(arr);
        //OneDimArr.printInt(arr);
        int max = arr[0] + arr[SIZE-1];
        for (int i=1; i<SIZE/2; i++){
            if (arr[i] + arr[SIZE-(i+1)] > max){
                max = arr[i] + arr[SIZE-(i+1)];
            }
        }
        System.out.println(max);
    }
}
