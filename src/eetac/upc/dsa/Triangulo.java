package eetac.upc.dsa;

import eetac.upc.dsa.Figura;

public class Triangulo extends Figura {
    public int base;
    public int altura;

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Triangulo() {
        super();
    }

    public double area() {
        return (double) (base * altura) /2;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }

}

