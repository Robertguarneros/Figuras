package eetac.upc.dsa;

public abstract class Figura implements Comparable<Figura>{
     public abstract double area();

     @Override
     public int compareTo(Figura o) {
          if(this.area()>o.area()){
               return 1;
          }else if (this.area()<o.area()){
               return -1;
          }else{
               return 0;
          }
     }
}
