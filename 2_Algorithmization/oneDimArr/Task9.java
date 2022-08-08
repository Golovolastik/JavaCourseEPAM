package arrays.oneDimArr;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// В массиве целых чисел размером N найти наиболее часто встречающееся.
// Если таких чисел несколько, то определить наименьшее из них
public class Task9 {
    public static void main(String[] args){
        final int SIZE = 10;
        Random random = new Random();
        List<Integer> arraySource = new ArrayList<Integer>();
        for (int i=0; i<SIZE; i++){
            arraySource.add(i, random.nextInt() % 3);
        }
        List<Integer> arrayNumber = new ArrayList<Integer>();
        List<Integer> arrayCount = new ArrayList<Integer>();
        arrayNumber.add(0, arraySource.get(0));
        arrayCount.add(0, 1);
        for (int i=1; i<SIZE; i++) {
            for (int j=0; j<arrayNumber.size(); j++){
                if (arraySource.get(i) == arrayNumber.get(j)){
                    arrayCount.set(j, arrayCount.get(j)+1);
                    break;
                }
                if (j == arrayNumber.size()-1){
                    arrayNumber.add(j+1, arraySource.get(i));
                    arrayCount.add(j+1, 1);
                    j++;
                }
            }
        }
        int mostFrequent = arrayCount.get(0);
        int min = arrayNumber.get(0);
        for (int i=1; i<arrayCount.size(); i++){
            if (arrayCount.get(i) > mostFrequent){
                mostFrequent = arrayCount.get(i);
                min = arrayNumber.get(i);
            }
        }
        for (int i=0; i<arrayCount.size(); i++){
            if (arrayCount.get(i) == mostFrequent && arrayNumber.get(i) < min){
                min = arrayNumber.get(i);
            }
        }
        System.out.println(arraySource);
        System.out.println(min);


    }
}

