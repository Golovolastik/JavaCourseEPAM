package sorting;

// Даны две возрастающие последовательности.
// Образовать из ниx возрастающую последовательность
public class Task2 {
    public static void main(String[] args){
        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {2, 4, 6, 8, 10};
        int[] result = new int[array1.length + array2.length];
        for (int i=0, j=0; i<array1.length || j<array2.length; i++, j++){
            i = i==array1.length ? --i : i;
            j = j==array2.length ? --j : j;
            if (array1[i] < array2[j]) {
                result[i+j] = array1[i];
                j--;
            } else {
                result[i+j] = array2[j];
                i--;
            }
        }
    }
}
