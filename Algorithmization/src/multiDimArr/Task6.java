package multiDimArr;

//Сформировать квадратную матрицу порядка n по заданному образцу (n-четное)
//    |1    1    1   1   1   1|
//    |0    1    1   1   1   0|
//    |0    0    1   1   0   0|
//    |0    0    1   1   0   0|
//    |0    1    1   1   1   0|
//    |1    1    1   1   1   1|
public class Task6 {
    public static void main(String[] args){
        final int SIZE = 10;
        int[][] array = new int[SIZE][SIZE];
        for (int i=0; i<SIZE; i++) {
            if (i < SIZE / 2) {
                for (int j = i; j < SIZE - i; j++) {
                    array[i][j] = 1;
                }
            } else {
                for (int j = SIZE-i-1; j <= i; j++) {
                    array[i][j] = 1;
                }
            }
        }
        MultiDimArr.printTwoDInt(array,SIZE,SIZE);
    }
}
