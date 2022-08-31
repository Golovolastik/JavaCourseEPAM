package dec;

// Написать программу, определяющую сумму n-значных чисел,
// содержащих только нечетные цифры.
// Определить также, сколько четных цифр в найденной сумме
public class Task16 {
    static boolean oddDigit(int digit){
        if (digit % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }
    static boolean oddNumber(int number){
        int temp = number;
        while (temp > 9){
            int digit = temp % 10;
            temp /= 10;
            if (!oddDigit(digit)){
                return false;
            }
        }
        if (oddDigit(temp)){
            return true;
        }
        return false;
    }
    static int sumOfNumbers(int nDigitNumber){
        int sum = 0;
        int firstNumber = (int) Math.pow(10, nDigitNumber-1);
        int lastNumber = (int) Math.pow(10, nDigitNumber) - 1;
        for (int i=firstNumber; i<=lastNumber; i++){
            if(oddNumber(i)){
                sum += i;
            }
        }
        return sum;
    }
    static int numberOfEvenDigits(int number){
        int temp = number;
        int sum = 0;
        while (temp > 9) {
            int digit = temp % 10;
            temp /= 10;
            if (!oddDigit(digit)){
                sum += 1;
            }
        }
        if (!oddDigit(temp)) {
            sum += 1;
        }
        return sum;
    }
    public static void main(String[] args){
        int result = sumOfNumbers(7);
        System.out.println(result);
        System.out.println(numberOfEvenDigits(result));
    }
}
