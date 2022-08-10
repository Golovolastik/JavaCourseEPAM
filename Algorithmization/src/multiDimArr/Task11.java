package multiDimArr;

import java.util.Random;

// Матрицу 10х20 заполнить случайными числами от 0 до 15.
// Вывести на экран саму матрицу и номера строк, в котором число 5 встречается три и более раз.
public class Task11 {
    public static void main(String[] args) {
        final int ROW = 10;
        final int COLUMN = 20;
        int[][] array = new int[ROW][COLUMN];
        Random random = new Random();
        int count;
        for (int i = 0; i < ROW; i++) {
            count = 0;
            for (int j = 0; j < COLUMN; j++) {
                array[i][j] = random.nextInt(0, 16);
                if (array[i][j] == 5){
                    count += 1;
                }
            }
            if (count >= 3){
                System.out.println("Row number " + (i+1) + " contains 3 or more numbers 5");
            }
        }
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COLUMN; j++) {
                System.out.printf("%4d", array[i][j]);
            }
            System.out.println();
        }
    }
}