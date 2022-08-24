package dec;

import oneDimArr.OneDimArr;

// Даны натуральные числа K и N.
// Написать методы формирования массива A, элементами которого являются числа,
// сумма цифр которых равна K и которые не больше N.
public class Task12 {
    static int SumOfDigits(int x){
        int[] array = DigitsOfNumber.initArray(x);
        int sum = 0;
        for (int i=0; i< array.length; i++){
            sum += array[i];
        }

        return sum;
    }
    static int[] initArray(int K, int N){
        int[] result = new int[N];
        int count = 0;
        for (int i=N; i>=0; i--){
            if (SumOfDigits(i) == K){
                result[count] = i;
                count++;
            }
        }
        result = cutArray(result, count);

        return result;
    }
    static int[] cutArray(int[] array, int count){
        int[] result = new int[count];
        for (int i=0; i<count; i++){
            result[i] = array[i];
        }

        return result;
    }
    public  static void main(String[] args){
        final int K = 6;
        final int N = 311;
        int[] result = initArray(K, N);
        OneDimArr.printInt(result);

    }
}
