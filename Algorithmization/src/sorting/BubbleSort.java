package sorting;

import oneDimArr.OneDimArr;

public class BubbleSort {
    public static void sort(int[] arr, boolean reverse){
        int count = 0;
        if (reverse) {
            for (int i=0; i<arr.length-1; i++){
                for (int j=0; j<arr.length-i-1; j++){
                    if (arr[j] < arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                        count++;
                    }
                }
            }
            System.out.println("Number of permutations: " + count);
        } else {
            for (int i=0; i<arr.length-1; i++){
                for (int j=0; j<arr.length-i-1; j++){
                    if (arr[j] > arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                        count++;
                    }
                }
            }
            System.out.println("Number of permutations: " + count);
        }
    }
    public static void main(String[] args){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        BubbleSort.sort(array, true);
        //OneDimArr.printInt(array);
    }
}
