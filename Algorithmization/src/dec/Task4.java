package dec;


import oneDimArr.OneDimArr;

// На плоскости заданы своими координатами n точек.
// Написать методы, опреляющие, между какими из пар точек самое большое расстояние
public class Task4 {
    public static double distance(int x1, int y1, int x2, int y2){
        double result = Math.sqrt((Math.pow(x2-x1, 2))+(Math.pow(y2-y1, 2)));
        return result;
    }

    public static double maxDistance(int[][] array){
        double result = 0;
        double maxDist = 0;
        int[] dot1 = new int[2];
        int[] dot2 = new int[2];
        for (int i=0; i<array.length; i++){
            for (int j=i+1; j<array.length; j++){
                double dist = distance(array[0][i], array[1][i], array[0][j], array[1][j]);
                if (dist > maxDist){
                    maxDist = dist;
                    dot1 = new int[]{array[0][i], array[1][i]};
                    dot2 = new int[]{array[0][j], array[1][j]};
                }
            }
        }
        System.out.printf("x1: %d, y1: %d\n", dot1[0], dot1[1]);
        System.out.printf("x2: %d, y2: %d\n", dot2[0], dot2[1]);
        System.out.printf("Distance: %.2f\n", maxDist);

        return maxDist;
    }
    public static void main(String[] args) {
        int[] x = {1, 4, -2, 0, 1};
        int[] y = {-3, 8, -2, 1, 4};
        int[][] array = {x, y};
        System.out.print(" x | ");
        OneDimArr.printInt(x);
        System.out.println("-----------------");
        System.out.print(" y |");
        OneDimArr.printInt(y);
        double result = maxDistance(array);

    }
}
