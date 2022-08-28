package dec;

import oneDimArr.OneDimArr;

public class Prime {
    public static int[] findPrimes(int n){
        int[] array = new int[n-1];
        initArray(array);
        array = findPrimesInArray(array);

        return array;
    }
    static void initArray(int[] array){
        int lastNumber = array.length + 1;
        for (int i=2; i<=lastNumber; i++){
            array[i-2] = i;
        }
    }
    public static int[] findPrimesInArray(int[] array){
        int count = 0;
        for (int i=0; i<array.length; i++){
            if (array[i] !=0){
                count++;
                for (int j=i+array[i]; j<array.length; j+=array[i]){
                    array[j] = 0;
                }
            }
        }
        int[] result = cleanArray(array, count);

        return result;
    }
    static int[] cleanArray(int[] array, int size){
        int[] result = new int[size];
        int count = 0;
        for (int i=0; i<array.length; i++){
            if (array[i] != 0){
                result[count] = array[i];
                count++;
            }
        }
        return result;

    }
    public static void main(String[] args){
        int[] result = findPrimes(100);
        OneDimArr.printInt(result);
    }
}
