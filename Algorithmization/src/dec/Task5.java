package dec;

import oneDimArr.OneDimArr;

// Составить программу,которая находит в массиве второе по величине число
public class Task5 {
    public static int findMax(int[] arr){
        int max = arr[0];
        int N = arr.length;
        for (int i=1; i<N; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void findSecond(int[] arr){
        int max = findMax(arr);
        int second = arr[0];
        int cnt = 1;
        while (second == max){
            second = arr[cnt];
            cnt++;
        }
        for (int i=0; i<arr.length; i++){
            if (arr[i] > second && arr[i] != max) {
                second = arr[i];
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Second: " + second);
    }

    public static void main(String[] args){
        final int N = 10;
        int[] A = new int[N];
        for (int i=0; i<N; i++){
            A[i] = (int)(Math.random() * 100);
        }
        OneDimArr.printInt(A);
        findSecond(A);
    }
}
