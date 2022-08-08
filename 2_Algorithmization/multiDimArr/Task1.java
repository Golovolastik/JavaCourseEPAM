package multiDimArr;

// Дана матрица.
// Вывести на экран все нечетные столбцы,
// у которых первый элемент больше последнего.
public class Task1 {
    public static void main(String[] args){
        final int SIZE = 7;
        int[][] array = new int[SIZE][SIZE];
        MultiDimArr.initTwoDInt(array, SIZE, SIZE);
        MultiDimArr.printTwoDInt(array, SIZE, SIZE);
        System.out.println();
        for (int i=0; i<SIZE; i++){
            for (int j = 0; j<SIZE; j+=2){
                if (array[0][j] > array[SIZE-1][j]){
                    System.out.printf("%4d ", array[i][j]);
                }
            }
            System.out.println();
        }
    }
}
