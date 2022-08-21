package dec;

// Даны числа X, Y, Z, T - длины сторон четырехугольника.
// Написать методы вычисления его площади, если угол между сторонами X и Y - прямой
public class Task9 {
    public static double findDiagonal(double x, double y){
        double d = Math.sqrt(x*x + y*y);

        return d;

    }

    public static double triangleArea(double z, double t, double d){
        double p = (z + t + d) / 2;
        double S = Math.sqrt(p*(p-z)*(p-t)*(p-d));

        return S;
    }

    public static double findArea(double x, double y, double z, double t){
        double d = findDiagonal(x, y);
        double S = triangleArea(x, y, d) + triangleArea(z, t, d);

        return S;
    }

    public static void main(String[] args){
        double X = 2;
        double Y = 5;
        double Z = 3;
        double T = 4;
        System.out.println(findArea(X, Y, Z, T));
    }
}
