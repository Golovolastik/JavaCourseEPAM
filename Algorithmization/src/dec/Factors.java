package dec;

public class Factors {
    public static int[] findFactors(int number){
        int[] arr = new int[number/2];
        int cnt = 0;
        for (int i=1; i<=arr.length; i++){
            if (number % i == 0) {
                arr[cnt] = i;
                cnt++;
            }
        }
        int[] A = new int[cnt+1];
        A[cnt] = number;
        System.arraycopy(arr, 0,  A, 0, cnt);

        return A;
    }

    public static int[] factorsOfTwo(int a, int b){
        int[] A = findFactors(a);
        int[] B = findFactors(b);
        int[] array = new int[a+b];
        int cnt=0;
        for (int i=0; i<A.length; i++){
            for (int j=0; j<B.length; j++){
                if (B[j] == A[i]){
                    array[cnt] = A[i];
                    cnt++;
                }
            }
        }
        int[] result = new int[cnt];
        System.arraycopy(array, 0, result, 0, cnt);

        return result;
    }

    public static int GCF(int a, int b){
        int[] factors = factorsOfTwo(a, b);
        int max_factor = factors[factors.length-1];

        return max_factor;
    }

    public static int LCM(int a, int b){
        int LCM = (a*b)/GCF(a, b);
        return LCM;
    }

    public static void main(String[] args){

        int result = LCM(8, 10);
        System.out.println(result);
    }
}
