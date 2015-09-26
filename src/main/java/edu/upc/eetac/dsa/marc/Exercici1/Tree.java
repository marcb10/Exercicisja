package edu.upc.eetac.dsa.marc.Exercici1;


public class Tree {
    private String tipo;
    private int tamaño;
    public Tree()
    {
        tipo = "árbol";
        tamaño = 0;
    }
    public Tree(int t)
    {
        tipo = "árbol";
        tamaño = t;
    }
    public Tree(String t)
    {
        tipo = t;
        tamaño = 0;
    }
    public Tree(int t, String TT)
    {
        tipo = TT;
        tamaño = t;
    }
    public void escribir()
    {
        if (tamaño > 0)
        {
            System.out.println("Un " + tipo + " de " + tamaño + " metros");
        }
        else
        {
            System.out.println("Un " + tipo);
        }
    }
}
