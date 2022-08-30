package dec;

import oneDimArr.OneDimArr;

import java.util.ArrayList;

// Найти все натуральные n-значные числа,
// цифры в которых образуют сторого возрастающую последовательность
public class Task15 {
    static ArrayList<Integer> findSequence(int n){
        int size = (int) Math.pow(10, n) - (int) Math.pow(10, n-1);
        ArrayList<Integer> result = new ArrayList<Integer>();
        int firstNumber = (int) Math.pow(10, n-1);
        int lastNumber = (int) Math.pow(10, n) - 1;
        for (int i=firstNumber; i<=lastNumber; i++){
            if (checkSequence(i)){
                result.add(i);
            }
        }
        return result;
    }
    static boolean checkSequence(int num){
        int[] digits = DigitsOfNumber.initArray(num);
        int numberOfDigits = digits.length;
        for (int i=0; i<numberOfDigits-1; i++){
            if (digits[i] > digits[i+1]) {
                return false;
            }
            if (i == numberOfDigits-2) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int n = 2;
        ArrayList<Integer> result =  findSequence(n);
        System.out.println(result.size());
    }
}
