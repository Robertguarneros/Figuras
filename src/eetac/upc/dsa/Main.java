package eetac.upc.dsa;

import eetac.upc.dsa.*;

public class Main {
    public static void main(String[] args) {
        Figura[] v = new Figura[4];
        v[0] = new Rectangulo(5, 3);
        v[1] = new Circulo(5);
        v[2] = new Cuadrado(5);
        v[3] = new Circulo(120);
        double res = GestorFiguras.suma(v);
        System.out.println("suma: " + res);
        GestorFiguras.print(v);
        GestorFiguras.sort(v);
        System.out.println("Ordenadas:");
        GestorFiguras.print(v);

    }
}