package sorting;


import oneDimArr.OneDimArr;

public class SelectionSort {
    public static void sort(int[] arr, boolean reverse) {
        if (reverse) {
            for (int i = 0; i < arr.length; i++) {
                int max = arr[i];
                int idx = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] > max) {
                        max = arr[j];
                        idx = j;
                    }
                }
                int temp = arr[idx];
                arr[idx] = arr[i];
                arr[i] = temp;
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                int min = arr[i];
                int idx = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < min) {
                        min = arr[j];
                        idx = j;
                    }
                }
                int temp = arr[idx];
                arr[idx] = arr[i];
                arr[i] = temp;
            }
        }
    }
    public static void main(String[] args){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        SelectionSort.sort(array, true);
        OneDimArr.printInt(array);
    }
}
