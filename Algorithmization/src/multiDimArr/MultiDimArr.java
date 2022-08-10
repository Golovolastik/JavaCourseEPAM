package multiDimArr;

import java.util.Random;

public class MultiDimArr {
    static void initTwoDInt(int[][] arr, int rowNumber, int columnNumber){
        Random random = new Random();
        for (int i=0; i<rowNumber; i++){
            for (int j=0; j<columnNumber; j++){
                arr[i][j] = random.nextInt(-10, 10);
            }
        }
    }

    static void printTwoDInt(int[][] arr, int rowNumber, int columnNumber){
        for (int i=0; i<rowNumber; i++){
            for (int j=0; j<columnNumber; j++){
                System.out.printf("%4d ", arr[i][j]);
            }
            System.out.println();
        }
    }

    static void printTwoDDouble(double[][] arr, int rowNumber, int columnNumber){
        for (int i=0; i<rowNumber; i++){
            for (int j=0; j<columnNumber; j++){
                System.out.printf("%7.3f ", arr[i][j]);
            }
            System.out.println();
        }
    }
}
