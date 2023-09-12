package eetac.upc.dsa;

import eetac.upc.dsa.Figura;

public class Rectangulo extends Figura {
    public int l1;

    public Rectangulo(int l1, int l2) {
        this.l1 = l1;
        this.l2 = l2;
    }

    public int l2;

    public int getL1() {
        return l1;
    }

    public void setL1(int l1) {
        this.l1 = l1;
    }

    public int getL2() {
        return l2;
    }

    public void setL2(int l2) {
        this.l2 = l2;
    }

    public Rectangulo() {
        super();
    }
    public double area(){
        return l1*l2;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "l1=" + l1 +
                ", l2=" + l2 +
                '}';
    }

}
