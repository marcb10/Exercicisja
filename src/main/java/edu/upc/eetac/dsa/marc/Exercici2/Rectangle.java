package edu.upc.eetac.dsa.marc.Exercici2;

public class Rectangle implements Shape{
    private int altura;
    private int base;
    private int area;
    private String s;
    public Rectangle(int h, int b){
        altura = h;
        base = b;
    }
    public double area(){
        area = altura*base;
        return area;
    }
    public String Escriu(){
        s = "I'm a Rectangle ";
        return s;
    }
}