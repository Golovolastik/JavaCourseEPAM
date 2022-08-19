package sorting;

import oneDimArr.OneDimArr;

import java.util.Random;

public class Shell {
    static void sort(int[] arr) {
        int cnt = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            cnt++;
            if (arr[i] <= arr[i + 1]) {
                continue;
            } else {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                i = i > 0 ? i-=2 : --i;
            }
        }
        System.out.println(cnt);
    }

    static void intervalSort(int[] arr){
        int N = arr.length;
        for (int interval=N/2; interval>0; interval/=2){
            for (int i=interval; i<N; i++){
                int temp = arr[i];
                int j;
                for (j=i; j>=interval && arr[j-interval]>temp; j-=interval){
                    arr[j] = arr[j-interval];
                }
                arr[j] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int seed = 4;
        Random random = new Random();
        int[] array = new int[10];
        for (int i=0; i<array.length;i++){
            array[i] = random.nextInt(1, 20);
        }
        OneDimArr.printInt(array);
        intervalSort(array);
        OneDimArr.printInt(array);
    }
}
