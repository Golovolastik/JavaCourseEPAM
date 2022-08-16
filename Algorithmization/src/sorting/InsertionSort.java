package sorting;

import oneDimArr.OneDimArr;

public class InsertionSort {
    public static void slide_sort(int[] arr){
        for (int i=1; i<arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j>=0 && arr[j]>key) {
                arr[j+1] = arr[j];
                j -= 1;
            }
            arr[j+1] = key;
        }
    }

    public static void sort(int[] arr){
          //todo fulfill the conditions:
          // - binary search method
          // - insertion with binary search method
    }

    public static void main(String[] args) {
        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        InsertionSort.slide_sort(array);
        OneDimArr.printInt(array);
    }
}
