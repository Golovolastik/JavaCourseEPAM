package dec;

// Функция для нахождения НОД 4 чисел
public class Task2 {
    public static int fourGCF(int a, int b, int c, int d){
        int result = Factors.GCF(Factors.GCF(Factors.GCF(a, b), c), d);

        return result;
    }

    public static int endlessGCF(int[] array){
        int i = 1;
        while (i < array.length){
            array[i] = Factors.GCF(array[i-1], array[i]);
            i++;
        }
        int result = array[i-1];

        return result;
    }
    public static void main(String [] args){
        int a = 20;
        int b = 50;
        int c = 120;
        int d = 140;
        int result = fourGCF(a, b, c, d);
        System.out.println(result);
        int[] array = {a, b, c, d, d, c, b, a};
        result = endlessGCF(array);
        System.out.println(result);

    }
}
