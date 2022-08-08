package arrays.oneDimArr;

// Даны целые числа a1, a2,..., an. Вывести на печать только те числа, для которых ai>i
public class Task5 {
    public static void main(String[] args){
        final int N = 25;
        int[] arr = new int[N];
        OneDimArr.initInt(arr);
        for (int i=0; i<N; i++){
            if (arr[i] > i+1){
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}
