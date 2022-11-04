package curs28.stari_thread;

public class InfinitTask implements Runnable {

    @Override
    public synchronized void run() {
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() +  "detine resursa");
        }
    }
}
