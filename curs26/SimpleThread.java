package curs26;

public class SimpleThread extends Thread {
    @Override
    public void run() {
        System.out.println("Rulez instructiuni din threadul: " + Thread.currentThread().getName());
    }
}
