package arrays.oneDimArr;

// Даны действительные числа. Поменять местами наибольший и наименьший элементы
public class Task4 {
    public static void main(String[] args) {
        final int N = 10;
        double[] arr = new double[N];
        OneDimArr.initDouble(arr);
        double max = arr[0];
        int max_c = 0;
        double min = arr[0];
        int min_c = 0;
        for (int i=1; i<arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
                max_c = i;
            } else if (arr[i] < min){
                min = arr[i];
                min_c = i;
            }
            else continue;
        }
        arr[max_c] = min;
        arr[min_c] = max;
    }
}
