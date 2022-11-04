package curs27.exemplu;

public class ConsumatorRunnable implements Runnable {

    BlockingQueue<String> coada;

    public ConsumatorRunnable(BlockingQueue<String> coada) {
        this.coada = coada;
    }

    @Override
    public void run() {
        while (true){
            try {
                coada.stergere();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
