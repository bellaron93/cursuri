package curs26;

public class ComplexRunnable implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i < 20; i++)
            System.out.println("Rulez instructiuni din threadul: " + Thread.currentThread().getName());
    }
}
