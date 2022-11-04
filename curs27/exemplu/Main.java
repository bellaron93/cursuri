package curs27.exemplu;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        BlockingQueue<String> coada = new BlockingQueue<>(5);

        ProducerRunnable producerRunnable = new ProducerRunnable(coada);
        ConsumatorRunnable consumatorRunnable = new ConsumatorRunnable(coada);
        Thread producer = new Thread(producerRunnable, "Producer");
        Thread consumer = new Thread(consumatorRunnable, "Consumer1");
        Thread consumer2 = new Thread(consumatorRunnable, "Consumer2");

        producer.start();
        consumer.start();
        consumer2.start();
    }
}
