package dec;

// Из заданного числа вычли сумму его цифр.
// Из результата вновь вычли сумму его цифр и т.д.
// Сколько таких действий надо произвести, чтобы получился нуль?
public class Task17 {
    static int sumOfDigits(int number){
        int sum = 0;
        int temp = number;
        while (temp > 9){
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
        }
        sum += temp;
        //System.out.printf("%d - %d = ", number, sum);
        return sum;
    }
    static void turnToZero(int number){
        int count = 0;
        while (number > 0){
            number -= sumOfDigits(number);
            //System.out.println(number);
            count++;
        }
        System.out.println("Number of iterations: " + count);
    }
    public static void main(String[] args){
        turnToZero(3456);
    }
}
