package edu.upc.eetac.dsa.marc.ExerciciThreads;

import java.util.Random;

public class ThreadClass extends Thread {
    long ultimavez = 0;
    int counter = 0;

    public  ThreadClass(String nombre){
        super(nombre);
    }

    @Override
    public void run()
    {
        for (int i=0; i<10; i++)
        {
            long CurrentExecution = System.currentTimeMillis();
            long elapsed = (ultimavez == 0)? 0 : CurrentExecution - ultimavez;
            ultimavez = CurrentExecution;
            System.out.println(getName() + " elapsed = " + elapsed + " ms. [" + (++counter) +"]");
            long sleep = (long) (Math.random() * 2000);
            try {
                Thread.sleep(sleep);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }

        }
    }
}
