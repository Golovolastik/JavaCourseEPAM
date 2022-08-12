package multiDimArr;

// Построить магический квадрат размером n.
// !!! Работает только с нечетными значениями n.
public class Task16 {
    public static void main(String[] args){
        int n = 3;
        int m = n*(n*n+1)/2; // Сумма элементов в каждом ряду, столбце и диагоналях
        int[][] array = new int[n][n];
        System.out.println(m);
        int i = n/2;
        int j = n-1;
        int number = 1;
        array[i][j] = number;
        while (number <= n*n){
            number++;
            if (i==-1 && j==n){
                i = 0;
                j = n-2;
            } else {
                if (i-1 < 0) {
                    i = n-1;
                }
                if (j+1 > n-1) {
                    j = 0;
                }
            }

            if (array[i][j] != 0) {
                i += 1;
                j -= 2;
            }
            array[i][j] = number;
            i -= 1;
            j += 1;

        }
        MultiDimArr.printTwoDInt(array, n, n);

    }
}
