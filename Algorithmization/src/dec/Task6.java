package dec;

// Написать методы, проверяющие, являются ли три числа взаимно простыми
public class Task6 {
    public static boolean isRelativelyPrime(int a, int b, int c){
        int[] array = {a, b, c};
        for (int i=0; i<array.length; i++){
            for (int j=1; j<array.length; j++){
                int gcf = Factors.GCF(array[i], array[j]);
                if (gcf == 1){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args){
        int a = 51;
        int b = 9;
        int c = 21;
        System.out.println(isRelativelyPrime(a, b, c));
    }
}
