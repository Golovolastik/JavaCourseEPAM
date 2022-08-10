package multiDimArr;

import java.util.Scanner;

// В числовой матрице поменять местами два любых столбца.
// Номера пользователь вводит с клавиатуры
public class Task8 {
    public static void main(String[] args){
        final int SIZE = 5;
        int[][] array = new int[SIZE][SIZE];
        MultiDimArr.initTwoDInt(array, SIZE, SIZE);
        System.out.println("Look at our matrix.");
        MultiDimArr.printTwoDInt(array, SIZE, SIZE);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's swap two columns!");
        System.out.println("Enter the first column to swap:");
        int k = scanner.nextInt() - 1;
        System.out.println("Enter the second column to swap:");
        int m = scanner.nextInt() - 1;
        for (int i=0; i<SIZE; i++){
            int temp = array[i][k];
            array[i][k] = array[i][m];
            array[i][m] = temp;
        }
        System.out.println("Take a look at the result!");
        MultiDimArr.printTwoDInt(array, SIZE, SIZE);
    }
}
