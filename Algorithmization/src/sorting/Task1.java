package sorting;

import oneDimArr.OneDimArr;

import static oneDimArr.OneDimArr.printInt;

// Заданы два массива разной длины и натуральное число k.
// Объеденить их в один массив, включив второй между k-м k+1 элементами первого
public class Task1 {
    public static void main(String[] args){
        int n = 5;
        int m = 7;
        int[] array1 = new int[n];
        int[] array2 = new int[m];
        OneDimArr.initInt(array1);
        OneDimArr.initInt(array2);
        int k = 3;
        int[] result = new int[n+m];
        for (int i=0; i<n+m; i++){
            if (i == k){
                for (int j=0; j<m; j++){
                    result[i] = array2[j];
                    i++;
                }
            }
            if (i > k) {
                result[i] = array1[i-m];
            } else {
                result[i] = array1[i];
            }
        }
        System.out.println("1st array:");
        printInt(array1);
        System.out.println("2nd array:");
        printInt(array2);
        System.out.println("k = " + k);
        System.out.println("Result:");
        printInt(result);

    }
}
