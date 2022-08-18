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
    public static void main(String[] args) {
        int seed = 4;
        Random random = new Random();
        int[] array = new int[10];
        for (int i=0; i<array.length;i++){
            array[i] = random.nextInt(1, 20);
        }
        OneDimArr.printInt(array);
        sort(array);
        OneDimArr.printInt(array);
    }
}
