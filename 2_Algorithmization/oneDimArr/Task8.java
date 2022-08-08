package arrays.oneDimArr;

import java.util.ArrayList;
import java.util.List;

// Дана последовательность целых чисел.
// Образовать новую последовательность,
// выбросив из исходной те члены, которые равны min(a1, a2,..., aN).
public class Task8 {
    public static void main(String[] args){
        final int SIZE = 10;
        int[] arr = new int[SIZE];
        OneDimArr.initInt(arr);
        OneDimArr.printInt(arr);
        int min = arr[0];
        for (int i=1; i<SIZE; i++){
            min = Math.min(arr[i], min);
            }
        int countMin = 0;
        for (int i=0; i<SIZE; i++){
            if (arr[i] == min){
                countMin += 1;
            }
        }
        System.out.println(min);
        final int SIZEOFNEW = SIZE-countMin;
        int[] newArray = new int[SIZEOFNEW];
        int cnt = 0;
        int countForNewArray = 0;
        while (cnt < SIZE){
            if (arr[cnt] == min){
                cnt++;
                continue;
            } else {
                newArray[countForNewArray] = arr[cnt];
                cnt++;
                countForNewArray++;
            }
        }
        OneDimArr.printInt(newArray);
    }

    }

