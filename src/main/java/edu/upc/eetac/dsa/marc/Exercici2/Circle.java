package edu.upc.eetac.dsa.marc.Exercici2;

public class Circle implements Shape {
    private double radi;
    private double area;
    private String s;
    public Circle(double r){
        radi = r;
    }
    public double area()
    {
        area = Math.PI*radi*radi;
        return area;
    }
    public String Escriu(){
        s = "I'm a Circle ";
        return s;
    }
}

