package edu.upc.eetac.dsa.marc.ExerciciThreads;

public class RunnableClass implements Runnable {
    long ultimavez = 0;
    int count = 0;


    public void run(){
        for (int i = 0; i < 10; i++)
        {
            long CurrentExecution = System.currentTimeMillis();
            long elapsed = (ultimavez == 0)? 0 : CurrentExecution - ultimavez;
            ultimavez = CurrentExecution;
            System.out.println(Thread.currentThread().getName() + " elapsed = " + elapsed + " ms. [" + (++count) +"]");
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
