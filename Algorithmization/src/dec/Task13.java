package dec;

import oneDimArr.OneDimArr;

// Найти и напечатать все пары близнецов из отрезка [n, 2n]
public class Task13 {
    static int[] initArray(int n){
        int[] array = new int[n+1];
        for (int i=0; i<array.length; i++){
            array[i] = i+n;
        }
        return array;
    }
    static void findTwins(int n){
        int[] array = new int[n];
    }
    public static void main(String[] args){
        int n = 30;
        int[] array = initArray(n);
        OneDimArr.printInt(array);
    }
}
