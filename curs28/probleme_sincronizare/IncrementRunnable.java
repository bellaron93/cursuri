package curs28.probleme_sincronizare;

public class IncrementRunnable implements Runnable {

    public static Integer index = 0;

    @Override
    public synchronized void run() {

        System.out.println(Thread.currentThread().getName() + " : " + index);
        index++;
    }

    public Integer getIndex() {
        return index;
    }
}
