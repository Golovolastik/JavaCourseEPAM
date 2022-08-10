package multiDimArr;

//Сформировать квадратную матрицу порядка n по заданному образцу (n-четное)
//    |1    1    1   1|
//    |2    2    2   0|
//    |n-1  n-1  0   0|
//    |n    0    0   0|
public class Task5 {
    public static void main(String[] args){
        final int SIZE = 6;
        int[][] array = new int[SIZE][SIZE];
        for (int i=0; i<SIZE; i++){
            for (int j=0; j<SIZE-i; j++){
                array[i][j] = i+1;
            }
        }
        MultiDimArr.printTwoDInt(array, SIZE, SIZE);
    }
}
