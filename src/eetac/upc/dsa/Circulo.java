package eetac.upc.dsa;

public class Circulo extends Figura {
    public int r;

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public Circulo(int r) {
        this.r = r;
    }

    public Circulo() {
        super();
    }
    public double area(){
        return r*r*Math.PI;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "r=" + r +
                '}';
    }

}
