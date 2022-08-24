package dec;

import oneDimArr.OneDimArr;

public class Prime {
    public static int[] findPrimes(int n){
        int[] array = new int[n-1];
        initArray(array);
        findPrimesInArray(array);

        return array;
    }
    static void initArray(int[] array){
        int lastNumber = array.length + 1;
        for (int i=2; i<=lastNumber; i++){
            array[i-2] = i;
        }
    }
    static void findPrimesInArray(int[] array){
        int count =1;
        for (int i=0; i<array.length; i++){
            if (array[i] !=0){
                for (int j=i+array[i]; j<array.length; j+=array[i]){
                    array[j] = 0;
                    count++;
                }
            }
        }
    }
    static void cleanArray(int[] array, int count){

    }
    public static void main(String[] args){
        int[] result = new int[20];
        initArray(result);
        OneDimArr.printInt(result);
        int[] array = findPrimes(30);
        OneDimArr.printInt(array);
        findPrimesInArray(array);
        OneDimArr.printInt(array);
    }
}
