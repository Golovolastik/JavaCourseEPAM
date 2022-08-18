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
        while (high - low != 1) {
            idx = (high + low) / 2;
            if (arr[idx] == number) {
                return idx;
            } else if (arr[idx] > number) {
                high = idx;
            } else {
                low = idx;
            }
        }
        if (idx > 0) {
            if (arr[idx - 1] > number) {
                return --idx;
            } else if (arr[idx] < number) {
                return ++idx;
            }
        }
        return idx;
    }

    public static void sort(int[] arr){
        for (int i=1; i < arr.length; i++){
            int key = arr[i];
            int idx = findPosition(arr, 0, i, key);
            System.arraycopy(arr, idx, arr, idx+1, i-idx);
            arr[idx] = key;
        }
    }

    public static void main(String[] args) {
        int[] testArr = new int [20];
        for (int i=0; i< testArr.length; i++){
            testArr[i] = (int) (Math.random() * 20);
        }
        OneDimArr.printInt(testArr);
        sort(testArr);
        OneDimArr.printInt(testArr);
    }
}
