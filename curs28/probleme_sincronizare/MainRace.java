package curs28.probleme_sincronizare;

import java.util.ArrayList;
import java.util.List;

public class MainRace {

    public static void main(String[] args) throws InterruptedException {
        IncrementRunnable incrementare = new IncrementRunnable();
        List<Thread> threadList = new ArrayList<>(6);
        for (int i = 0; i < 6; i++) {
            Thread t1 = new Thread(incrementare);
            t1.start();
            threadList.add(t1);
        }

        for (int i = 0; i < 6; i++) {
            Thread thread1 = threadList.get(i);
            thread1.join();
        }

        System.out.println("Rezultat final: " + IncrementRunnable.index);
    }

}
