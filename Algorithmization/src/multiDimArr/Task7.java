package multiDimArr;

// Сформировать квадратную матрицу порядка N по правилу:
// A[I,J] = sin((I^2-J^2)/N)
public class Task7 {
    public static void main(String[] args) {
        final int N = 5;
        double[][] array = new double[N][N];
        for (int i=0; i<N; i++){
            for (int j=0; j<N; j++){
                // значение I и J в радианах
                array[i][j] = Math.sin((Math.pow(i+1, 2) - Math.pow(j+1, 2))/N);
            }
        }
        MultiDimArr.printTwoDDouble(array, N, N);
    }
}
