package curs28.probleme_sincronizare;

import static curs28.probleme_sincronizare.Deadlock.RESURSA1;
import static curs28.probleme_sincronizare.Deadlock.RESURSA2;

public class Thread1 extends Thread{

    public Thread1(String name) {
        super(name);
    }

    @Override
    public void run() {
        synchronized (RESURSA1) {
            System.out.println(Thread.currentThread().getName() + " detine resursa 1");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (RESURSA2){
                System.out.println(Thread.currentThread().getName() + " detine resursa 2");
            }
        }

    }
}
