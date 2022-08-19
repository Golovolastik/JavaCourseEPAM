package sorting;

import oneDimArr.OneDimArr;

public class Task8 {
    public static void main(String[] args){
        int n = 10;
        int[][] array = new int[n][n];
        for (int i=0; i<n; i++){
            array[0][i] = (int)(Math.random() * 10);
            array[1][i] = (int)(Math.random() * 10);
        }
        OneDimArr.printInt(array[0]);
        OneDimArr.printInt(array[1]);
    }
}
