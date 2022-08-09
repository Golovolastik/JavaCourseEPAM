package multiDimArr;

// Дана матрица. Вывести k-ю строку и p-й cтолбец.
public class Task3 {
    public static void main(String[] args){
        final int ROW = 4;
        final int COLUMN = 6;
        int k = 2;
        int p = 4;
        int[][] array = new int[ROW][COLUMN];
        MultiDimArr.initTwoDInt(array, ROW, COLUMN);
        MultiDimArr.printTwoDInt(array, ROW, COLUMN);
        System.out.println();
        for (int i=0; i<ROW; i++){
            for (int j=0; j<COLUMN; j++){
                if (j == p-1 || i == k-1){
                    System.out.printf("%4d ", array[i][j]);
                } else {
                    System.out.print("     ");
                }
            }
            System.out.println();
        }
    }
}
