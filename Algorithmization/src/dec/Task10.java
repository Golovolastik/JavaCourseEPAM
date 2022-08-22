package dec;

import oneDimArr.OneDimArr;

// Дано натуральное число N.
// Написать методы для формирования массива,
// элементами которого являются цифры числа N.
public class Task10 {
    static int[] initArray(int number){
        int[] array = new int[10];
        int digit;
        int count = array.length-1;
        while (number>9){
            digit = number % 10;
            number /= 10;
            array[count] = digit;
            count--;
        }
        array[count] = number;
        array = cutArray(array, array.length - count);

        return array;
    }
    static int[] cutArray(int[] array, int count){
        int[] newArray = new int[count];
        int i = array.length-count;
        int j=0;
        while (i < array.length){
            newArray[j] = array[i];
            i++;
            j++;
        }
        return newArray;
    }
    public static void main(String[] args){
        //int[] array = ;
        int x = 1234567834;
        int[] result = initArray(x);
        OneDimArr.printInt(result);
    }
}
