package multiDimArr;

// Найти положительные элементы главной диагонали квадратной матрицы.
public class Task10 {
    public static void main(String[] args){
        final int SIZE = 8;
        int[][] array = new int[SIZE][SIZE];
        MultiDimArr.initTwoDInt(array, SIZE, SIZE);
        MultiDimArr.printTwoDInt(array, SIZE, SIZE);
        for (int i=0; i<array.length; i++){
            if (array[i][i] > 0){
                System.out.printf("Element at [%d][%d] is positive.\n", i+1, i+1);
            }
        }
    }
}
