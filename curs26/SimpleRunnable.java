package curs26;

public class SimpleRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Rulez instructiuni din threadul: " + Thread.currentThread().getName());
    }
}
