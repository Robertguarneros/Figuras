package eetac.upc.dsa;

import java.lang.reflect.Array;
import java.util.Arrays;

public class GestorFiguras {
    public static double sum=0;
    public static double suma(Figura[] f){
        for (int i = 0; i < f.length; i++) {
            sum += f[i].area();
        }
        return sum;
    }
    public static void print(Figura[] f){
        for (int i = 0; i < f.length; i++) {
            System.out.println(f[i]);
        }
    }
    public static void sort(Figura[] f){
        Arrays.sort(f);
    }

}
