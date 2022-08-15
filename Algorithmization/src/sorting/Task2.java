package sorting;

import oneDimArr.OneDimArr;

// Даны две возрастающие последовательности.
// Образовать из ниx возрастающую последовательность
public class Task2 {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {2, 4, 6, 8, 10};
        int[] result = new int[array1.length + array2.length];
        int i = 0;  // array1 idx
        int j = 0;  // array2 idx
        while (i < array1.length || j < array2.length) {
            if (array1[i] < array2[j]) {
                result[i + j] = array1[i];
                i++;
                if (i == array1.length) {
                    for (int k = j; k < array2.length; k++) {
                        result[i + k] = array2[k];
                    }
                    break;
                }
            } else {
                result[i + j] = array2[j];
                j++;
                if (j == array2.length) {
                    for (int k = i; k < array1.length; k++) {
                        result[j + k] = array1[k];
                    }
                    break;
                }

            }
        }
        OneDimArr.printInt(result);
    }
}
