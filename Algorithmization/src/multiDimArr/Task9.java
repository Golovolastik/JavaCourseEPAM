package multiDimArr;

// Задана матрица неотрицательных чисел.
// Подсчитать сумму элементов в каждом столбце.
// Определить какой столбец содержит максимальную сумму.
public class Task9 {
    public static void main(String[] args) {
        final int ROW = 4;
        final int COLUMN = 7;
        int[][] array = new int[ROW][COLUMN];
        int[] sumArray = new int[COLUMN];
        MultiDimArr.initTwoDInt(array, ROW, COLUMN);
        int max = 0;
        int indexOfMax = 0;
        int sum = 0;
        for (int j=0; j<COLUMN; j++) {
            sum = 0;
            for (int i=0; i<array.length; i++) {
                sum += array[i][j];
            }
            if (sum > max) {
                max = sum;
                indexOfMax = j;
            }
            sumArray[j] = sum;  // Сумма элементов каждого столбца
        }
        System.out.println("Column with maximum sum: " + (indexOfMax+1));
    }
}
