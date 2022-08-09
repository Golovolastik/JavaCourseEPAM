package multiDimArr;

/* Сформировать квадратную матрицу порядка n по заданному образцу (n-четное)
    |1  2   3  ... n|
    |n n-1 n-2 ... 1|
    |1  2   3  ... n|
    |n n-1 n-2 ... 1|
*/
public class Task4 {
    public static void main(String[] args){
        final int SIZE = 6;
        int[][] array = new int[SIZE][SIZE];
        for (int i=0; i<SIZE; i++){
            for (int j=0; j<SIZE; j++){
                if (i % 2 == 0) {
                    array[i][j] = j+1;
                } else {
                    array[i][j] = SIZE - j;
                }
            }
        }
        MultiDimArr.printTwoDInt(array, SIZE, SIZE);
    }
}
