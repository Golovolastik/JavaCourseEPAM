package dec;

// Функция для нахождения НОД 4 чисел
public class Task2 {
    public static void main(String [] args){
        int a = 20;
        int b = 50;
        int c = 120;
        int d = 140;
        int result = Factors.GCF(Factors.GCF(Factors.GCF(a, b), c), d);
        System.out.println(result);

    }
}
