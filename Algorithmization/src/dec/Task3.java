package dec;

// Вычислить площадь правильного шестиугольника со стороной а,
// используя метод вычисления площади треугольника
public class Task3 {
    public static double equalTriangleSquare(int a){
        double S = a*a*((Math.sqrt(3)/4));
        System.out.println("Triangle: " + S);

        return S;
    }

    public static double regHex(int a){
        double S = 6 * equalTriangleSquare(a);
        System.out.println("Hex: " + S);

        return S;
    }

    public static void main(String[] args){
        int a = 6;
        double area = regHex(a);
        System.out.printf("%.3f", area);

    }
}
