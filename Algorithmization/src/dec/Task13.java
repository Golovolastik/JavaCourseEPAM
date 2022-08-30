package dec;

import oneDimArr.OneDimArr;

// Найти и напечатать все пары близнецов из отрезка [n, 2n]
public class Task13 {
    static void findTwins(int n){
        int[] array = Prime.findPrimes(2*n);
        printTwins(array, n);
    }
    static void printTwins(int[] array, int n) {
        for (int i=0; i<array.length-2; i++){
            if (array[i]<n){
                continue;
            }
            if (array[i] + 2 == array[i+1]){
                System.out.printf("(%d, %d) ", array[i], array[i+1]);
            }
        }
    }
    public static void main(String[] args){
        int n = 500;
        findTwins(n);
    }
}
