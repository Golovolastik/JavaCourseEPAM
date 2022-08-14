package sorting;

import oneDimArr.OneDimArr;

// Даны две возрастающие последовательности.
// Образовать из ниx возрастающую последовательность
public class Task2 {
    public static void main(String[] args){
        int[] array1 = {2, 4, 6, 8, 10};
        int[] array2 = {1, 3, 5, 7};
        int[] result = new int[array1.length + array2.length];
        for (int i=0, j=0; i<array1.length || j<array2.length; i++, j++){
            if (i==array1.length){
                for (int k=j; k<array2.length; k++) {
                    result[i+k] = array2[k];
                }
                continue;
            } else if (i==array2.length) {
                for (int k=i; k<array1.length; k++) {
                    result[i+k] = array1[k];
                }
                continue;
            }
            if (array1[i] < array2[j]) {
                result[i+j] = array1[i];
                j--;
            } else {
                result[i+j] = array2[j];
                i--;
            }
        }
        OneDimArr.printInt(result);
    }
}
