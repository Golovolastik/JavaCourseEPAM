package arrays.oneDimArr;

// Задана последовательность N вещественных чисел.
// Вычислить сумму тех, порялковые номера которых являются простыми числами

public class Task6 {
    static boolean checkPrime(int n){
        boolean result = true;
        if (n == 0 || n == 1){
            result = false;
            return result;
        }
        for (int i=2; i<(n/2); i++){
            if (n % i == 0) {
                result = false;
                return result;
            }
        }

        return result;
    }
    public static void main(String[] args){
        final int N = 6;
        double[] arr = new double[N];
        double sum = 0;
        OneDimArr.initDouble(arr);
        for (int i=0; i<N; i++){
            if (checkPrime(i+1)){
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}
