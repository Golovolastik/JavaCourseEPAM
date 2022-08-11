package multiDimArr;

// Найти наибольший элемент матрицы и заменить все нечетные элементы на него
public class Task15 {
    static int findMax(int[][] array, int row, int column){
        int max = array[0][0];
        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                if (array[i][j] > max){
                    max = array[i][j];
                }
            }
        }
        return max;
    }
    public static void main(String[] args){
        final int SIZE = 6;
        int[][] array = new int[SIZE][SIZE];
        MultiDimArr.initTwoDInt(array, SIZE, SIZE);
        MultiDimArr.printTwoDInt(array, SIZE, SIZE);
        System.out.println();
        int max = findMax(array, SIZE, SIZE);
        for (int i=0; i<SIZE; i++){
            for (int j=0; j<SIZE; j++){
                if (array[i][j] % 2 == 1){
                    array[i][j] = max;
                }
            }
        }
        MultiDimArr.printTwoDInt(array, SIZE, SIZE);
    }
}
