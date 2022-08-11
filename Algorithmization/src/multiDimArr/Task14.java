package multiDimArr;

import java.util.Random;

// Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
// причем в каждом столбце число единиц равно номеру столбца.
public class Task14 {
    public static void main(String[] args){
        int m = 6;
        int n = 4;
        int[][] array = new int[m][n];
        // Инициализируем матрицу
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                if (i<=j){
                    array[i][j] = 1;
                } else{
                    array[i][j] = 0;
                }
            }
        }
        MultiDimArr.printTwoDInt(array, m, n);
        System.out.println();
        // Сделаем матрицу "случайной"
        Random random = new Random();
        for (int j=0; j<n; j++){
            for (int i=0; i<m; i++) {
                int indexToSwap = random.nextInt(n);
                int temp = array[indexToSwap][j];
                array[indexToSwap][j] = array[i][j];
                array[i][j] = temp;
            }
        }
        MultiDimArr.printTwoDInt(array, m, n);
    }
}
