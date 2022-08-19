package sorting;

import oneDimArr.OneDimArr;

public class Task7 {
    public static void main(String[] args){
        int[] array1 = {1, 3, 5, 7, 9, 10, 11, 12};
        int[] array2 = {0, 0, 2, 4, 6, 8, 10, 12};
        int[] result = new int[array2.length];
        for (int i=0; i<array2.length; i++){
            for (int j=array1.length-1; j>=0; j--){
                if (array2[i] > array1[j]){
                    result[i] = j+1;
                    j = 0;
                }
            }
        }
        OneDimArr.printInt(array1);
        OneDimArr.printInt(array2);
        OneDimArr.printInt(result);
    }
}
