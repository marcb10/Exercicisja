package edu.upc.eetac.dsa.marc.Exercici_Concurrencia;

/**
 * Created by Marc on 29/09/2015.
 */
public class App {
    public static void main(String[] args) {
        String line = "Esto es una frase de prueba.\n";
        Buffer buffer = new Buffer();
        Thread producer = new Thread(new Producer(buffer, line), "Producer");
        Thread consumer = new Thread(new Consumer(buffer), "consumer");

        consumer.start();
        producer.start();
    }
}
