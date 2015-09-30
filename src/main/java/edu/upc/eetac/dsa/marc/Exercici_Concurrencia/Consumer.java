package edu.upc.eetac.dsa.marc.Exercici_Concurrencia;

public class Consumer implements Runnable{
    private Buffer buffer = null;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }


    public void run(){
        StringBuilder sb = new StringBuilder();
        char c;
        while ((c=buffer.get()) != '\n') {
            sb.append(c);
        }
        System.out.println(sb);
    }
}
