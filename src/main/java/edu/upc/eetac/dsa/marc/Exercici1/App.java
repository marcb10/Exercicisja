package edu.upc.eetac.dsa.marc.Exercici1;


public class App {
    public static void main( String[] args )
    {
        Tree[]arboles = new Tree[4];
        arboles[0] = new Tree(4);
        arboles[1] = new Tree("Roble");
        arboles[2] = new Tree();
        arboles[3] = new Tree(5,"Pino");

        for (int i = 0;i<4;i++)
        {
            arboles[i].escribir();
        }
    }
}
