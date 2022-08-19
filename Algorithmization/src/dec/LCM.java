package dec;

import dec.GCF.*;

// Least Common Multiple
public class LCM {
    public static int LCM(int a, int b){
        int LCM = (a*b)/ GCF.GCF(a, b);
        return LCM;
    }
    public static void main(String[] args){

        int result = LCM(8, 10);
        System.out.println(result);
    }
}
