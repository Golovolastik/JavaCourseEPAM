package multiDimArr;

// Построить магический квадрат размером n.
// !!! Работает только с нечетными значениями n.
public class Task16 {
    public static void main(String[] args){
        int n = 7;
        if (n%2 == 0) {
            System.exit(0);
        }
        int[][] array = new int[n][n];
        int i = n/2;
        int j = n-1;
        for (int number=1; number<=n*n; number++){
            array[i][j] = number;
            i -= 1;
            j += 1;
            if (i==-1 && j==n){
                i = 0;
                j = n-2;
            }
            if (i==-1){
                i = n-1;
            }
            if (j==n) {
                j = 0;
            }
            if (array[i][j] != 0){
                i += 1;
                j -= 2;
            }
        }
        int m = n*(n*n+1)/2; // Сумма элементов в каждом ряду, столбце и диагоналях
        System.out.printf("Magic square of size %d\n" +
                        "Sum in each row & column: %d\n", n, m);
        MultiDimArr.printTwoDInt(array, n, n);



    }
}
