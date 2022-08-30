package dec;


import oneDimArr.OneDimArr;

import java.util.ArrayList;

// Найти числа Армстронга от 1 до k
public class Task14 {
    static ArrayList<Integer> findArmstrong(int k){
        int[] array = initArray(k);
        ArrayList<Integer> result = initWithArmstrongs(array);

        return result;
    }
    static int[] initArray(int k){
        int[] array = new int[k];
        for (int i = 1; i <= k; i++) {
            array[i-1] = i;
        }
        return array;
    }
    static boolean checkNumber(int num){
        if (num == sumOfDigitsInPower(num)){
            return true;
        } else {
            return false;
        }
    }
    static int sumOfDigitsInPower(int n){
        int[] digits = DigitsOfNumber.initArray(n);
        int size = digits.length;
        int sum = 0;
        for (int i=0; i<digits.length; i++){
            sum += Math.pow(digits[i], size);
        }
        return sum;
    }
    static ArrayList<Integer> initWithArmstrongs(int[] array){
        ArrayList<Integer> armstrongsNumbers = new ArrayList<Integer>();
        for (int primeNumber:
                array) {
            if (checkNumber(primeNumber)){
                armstrongsNumbers.add(primeNumber);
            }
        }
        return armstrongsNumbers;
    }
    static void printArmstrongNumbers(int k){
        ArrayList<Integer> array = findArmstrong(k);
        for (Integer number:
             array) {
            System.out.print(number + " ");
        }
    }

    public static void main(String[] args){
        int k = 1_000_000;
        printArmstrongNumbers(k);

    }
}
