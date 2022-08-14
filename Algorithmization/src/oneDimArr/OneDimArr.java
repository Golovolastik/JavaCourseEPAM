package oneDimArr;

import java.util.Random;

public class OneDimArr {
    public static void initInt(int[] arr){
        Random random = new Random();
        for (int i=0; i<arr.length; i++){
            arr[i] = random.nextInt(1, 10);
        }
    }
    static void initDouble(double[] arr){
        Random random = new Random();
        for (int i=0; i<arr.length; i++){
            arr[i] = (-0.5 + random.nextDouble()) * 10;
        }
    }
    public static void printInt(int[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void printDouble(double[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
