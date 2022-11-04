package curs27.exemplu;

import java.util.Random;

public class ProducerRunnable implements Runnable{

    BlockingQueue<String> coada;

    public ProducerRunnable(BlockingQueue<String> coada) {
        this.coada = coada;
    }

    Random random  = new Random();

    @Override
    public void run() {
        while (true){
            try {
                coada.adaugare("persoana " + random.nextInt(100));
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
