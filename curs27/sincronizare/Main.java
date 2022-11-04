package curs27.sincronizare;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        IncrementRunnable incrementare = new IncrementRunnable();
        List<Thread> threadList = new ArrayList<>(100);
        for(int i = 0; i < 100; i++){
            Thread t1 = new Thread(incrementare);
            t1.start();
            threadList.add(t1);
        }

        for(int i = 0; i < 100; i++){
            Thread thread1 = threadList.get(i);
            thread1.join();
        }
        /*Thread t1 = new Thread(incrementare);
        Thread t2 = new Thread(incrementare);
        t1.start();
        t2.start();*/

        // oprim threadul curent pentru un interval fix de secunde
//        Thread.sleep(200);

        //asteptam din threadul curent ca threadul pe care se apeleaza metoda sa isi termine treaba
      /*  t1.join();
        t2.join();*/

        System.out.println("Rezultat final: " +incrementare.getIndex());
    }
}
