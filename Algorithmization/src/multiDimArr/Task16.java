package multiDimArr;

// Построить магический квадрат размером n.
// !!! Работает только с нечетными значениями n.
public class Task16 {
    public static void main(String[] args){
        int n = 4;
        int m = n*(n*n+1)/2; // Сумма элементов в каждом ряду, столбце и диагоналях
        int[][] array = new int[n][n];
        System.out.println(m);
        int i = n/2;
        int j = n-1;
        int number = 1;
        while (number <= n*n){
            array[i][j] = number;
            i -= 1;
            j += 1;
            if (i==-1 && j==n){
                i = 0;
                j = n-2;
            }
            i = i < 0 ? n-1 : i;
            j = j > n-1 ? 0 : j;
            if (array[i][j] != 0) {
                i += 1;
                j -= 2;
            }
            number++;
        }
        MultiDimArr.printTwoDInt(array, n, n);

    }
}
