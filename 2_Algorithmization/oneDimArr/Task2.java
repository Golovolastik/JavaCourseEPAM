package arrays.oneDimArr;

// Дана последовательность действительных чисел а1, a2, a3,..., an.
// Заменить все ее члены, ,больше данного Z, этим числом.
// Подсчитать количество замен.
public class Task2 {
    public static void main(String[] args){
        final int N = 15;
        double[] arr = new double[N];
        final double Z = 2;
        OneDimArr.initDouble(arr);
        //OneDimArr.printDouble(arr, N);
        int cnt = 0;
        for (int i=0; i<N; i++){
            if (arr[i] > Z){
                arr[i] = Z;
                cnt++;
            }
        }
        //OneDimArr.printDouble(arr, N);
        System.out.println(cnt);
    }
}
