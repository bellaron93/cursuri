package curs26;

public class Exemplu {

    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        // creare thread folosind copil de thread
        ComplexThread thread = new ComplexThread();
        thread.start();
        Thread.sleep(10);
        System.out.println(Thread.currentThread().getName());

        //creare thread folosind runnable ca argument
        Thread thread1 = new Thread(new ComplexRunnable());
        thread1.start();
        Thread thread2 = new Thread(()-> System.out.println("Rulez instructiuni din threadul: " + Thread.currentThread().getName()));
        thread2.start();
    }
}
