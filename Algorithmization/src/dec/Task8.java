package dec;

import oneDimArr.OneDimArr;

// Составить методы для вычисления
// трех последовательно расположенных элемента
// массива с номерами от k до m.
public class Task8 {
    public static int sumFromKtoM(int[] array, int k, int m){
        int sum = 0;
        for (int i=k-1; i<m; i++){
            sum += array[i];
        }
        return sum;
    }

    public static void main(String[] args){
        int[] D = new int[10];
        OneDimArr.initInt(D);
        OneDimArr.printInt(D);
        int k = 3;
        int m = 5;
        int sum = sumFromKtoM(D, k, m);
        System.out.printf("Sum from element %d to element %d is %d", k, m, sum);
    }

}
