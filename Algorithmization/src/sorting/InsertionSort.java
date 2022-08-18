package sorting;

import oneDimArr.OneDimArr;
import org.jetbrains.annotations.NotNull;

public class InsertionSort {
    public static int findPosition(int[] arr, int start, int end, int number) {
        int idx = 0;
        if (start == end) {
            idx = number > start ? start + 1 : start;
        }
        int high = end;
        int low = start;
        int counter = 0;
        while (high - low != 1) {
            counter++;
            idx = (high + low) / 2;
            if (arr[idx] == number) {
                //System.out.println(counter);
                return idx;
            } else if (arr[idx] > number) {
                high = idx;
            } else {
                low = idx;
            }
        }
        //System.out.println(counter);
        if (idx > 0) {
            if (arr[idx - 1] > number) {
                return --idx;
            } else if (arr[idx] < number) {
                return ++idx;
            }
        }
        return idx;
    }

    public static void slide_sort(int [] arr){
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

    //todo fulfill the conditions:
    // - binary search method
    // - insertion with binary search method

    public static void sort(int[] arr){
        for (int i=1; i < arr.length; i++){
            int key = arr[i];
            int idx = findPosition(arr, 0, i, key);
            //System.out.println(idx);
            System.arraycopy(arr, idx, arr, idx+1, i-idx);
            arr[idx] = key;
        }
    }

    public static void main(String[] args) {
        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] testArr = new int [20];
        for (int i=0; i< testArr.length; i++){
            testArr[i] = (int) (Math.random() * 20);
        }
        OneDimArr.printInt(testArr);
        //InsertionSort.slide_sort(array);
        //OneDimArr.printInt(array);
        //System.out.println(testArr.length);
        //int index = findPosition(testArr, 0, testArr.length-1, 2);
        //System.out.println(index);
        sort(testArr);
        OneDimArr.printInt(testArr);
    }
}
