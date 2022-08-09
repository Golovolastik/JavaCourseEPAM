package multiDimArr;

// Дана квадратная матрица.
// Вывести на экран все элементы, стоящие по диагонали
public class Task2 {
    public static void main(String[] args){
        final int SIZE = 5;
        int[][] array = new int[SIZE][SIZE];
        MultiDimArr.initTwoDInt(array, SIZE, SIZE);
        MultiDimArr.printTwoDInt(array, SIZE, SIZE);
        System.out.println();
        for (int i=0; i<SIZE; i++){
            System.out.printf("%4d ", array[i][i]);
        }
    }
}
