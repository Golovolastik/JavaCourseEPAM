package sorting;

import oneDimArr.OneDimArr;

public class InsertionSort {
    public static int findPosition(int[] arr, int start, int end, int number){
        int idx = 0;
        if (start == end) {
            idx = number > start ? start + 1 : start;
        }
        int high = end;
        int low = start;
        int counter = 0;
        while (/*high >= low &&*/ high - low != 1) {
            counter++;
            idx = (high + low) / 2;
            if (arr[idx] == number) {
                System.out.println(counter);
                return idx;
                } else if (arr[idx] > number) {
                    high = idx;
                } else {
                low = idx;
            }
        }
        System.out.println(counter);
        return idx;
    }
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
        //OneDimArr.printInt(array);
        int index = findPosition(array, 0, array.length-1, 6);
        System.out.println(index);
    }
}
