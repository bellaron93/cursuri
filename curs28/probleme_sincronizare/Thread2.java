package curs28.probleme_sincronizare;

import static curs28.probleme_sincronizare.Deadlock.RESURSA1;
import static curs28.probleme_sincronizare.Deadlock.RESURSA2;

public class Thread2 extends Thread{

    public Thread2(String name) {
        super(name);
    }

    @Override
    public void run() {
        synchronized (RESURSA2) {
            System.out.println(Thread.currentThread().getName() + " detine resursa 2");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (RESURSA1){
                System.out.println(Thread.currentThread().getName() + " detine resursa 1");
            }
        }

    }
}
