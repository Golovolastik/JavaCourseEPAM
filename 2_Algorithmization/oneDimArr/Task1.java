package arrays.oneDimArr;

// В массив A[N] занесены натуральные числа.
// Найти сумму тех элементов, которые кратны данному K


public class Task1 {
    public static void main(String[] args) {
        final int N = 10;
        final int[] A = new int[N];
        final int K = 3;
        OneDimArr.initInt(A);
        OneDimArr.printInt(A);
        int sum = 0;
        for (int i=0; i<N; i++){
            if (A[i] % K == 0) {
                sum += A[i];
            }
        }
        System.out.println(sum);
    }
}