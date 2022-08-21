package dec;

// Написать методы для вычисления факториалов всех нечетных чисел от 1 до 9
public class Task7 {
    public static int factorial(int n){
        int result = 1;
        for (int i=2; i<=n; i++){
            result *= i;
        }

        return result;
    }

    public static int[] oddFactorials(int n){
        int[] array = new int[n/2 + 1];
        int count=0;
        for (int i=1; i<=n; i+=2){
            array[count] = factorial(i);
            System.out.printf("Factorial of %d is %d\n", i, array[count]);
            count++;
        }

        return array;
    }

    public static void main(String[] args){
        int[] result = oddFactorials(9);
    }
}
