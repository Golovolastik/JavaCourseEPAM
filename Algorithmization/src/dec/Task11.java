package dec;

// Написать метод, определяющий, в каком из данных двух чисел больше цифр
public class Task11 {
    static void compare(int x, int y){
        String a = Integer.toString(x);
        String b = Integer.toString(y);
        if (a.length() > b.length()){
            System.out.printf("%d has more digits than %d", x, y);
        } else if (a.length() < b.length()) {
            System.out.printf("%d has more digits than %d", y, x);
        } else {
            System.out.printf("The number of digits in %d and %d is equal", x, y);
        }
    }
    public static void main(String[] args){
        int x = 1024;
        int y = 256;
        compare(x, y);
    }
}
