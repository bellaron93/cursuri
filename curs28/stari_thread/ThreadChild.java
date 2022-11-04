package curs28.stari_thread;

public class ThreadChild extends Thread{

    @Override
    public void run() {
        System.out.println("Executa instructiuni specifice");
    }
}
