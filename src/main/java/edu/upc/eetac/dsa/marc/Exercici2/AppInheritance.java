package edu.upc.eetac.dsa.marc.Exercici2;


public class AppInheritance {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(2.5);
        shapes[1] = new Rectangle(3,5);
        for (Shape shape : shapes)
            System.out.println(shape.Escriu() + " with area = " + shape.area());
    }
}
