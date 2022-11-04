package curs28.stari_thread;

import curs28.probleme_sincronizare.Thread2;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new ThreadChild();
        System.out.println("STARE dupa instantiere: " + t1.getState());
        t1.start();
        System.out.println("STARE dupa START: " + t1.getState());

/*        InfinitTask infinitTask = new InfinitTask();
        Thread t2 = new Thread(infinitTask);
        Thread t3 = new Thread(infinitTask);
        Thread.sleep(2000);
        t2.start();
        t3.start();
        System.out.println( "STARE" + t2.getName()+ t2.getState());
        System.out.println("STARE" + t3.getName() +t3.getState());*/

        Thread main = Thread.currentThread();
        Thread t4 = new Thread(() -> System.out.println(main.getState()));
        t4.start();
        t4.join();
        t1.join();


        Thread t5 = new Thread(() ->{
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t5.start();
        Thread.sleep(500);
        System.out.println("STARE t5: "+ t5.getState());
        t5.join();
        System.out.println("STARE t5: "+ t5.getState());

        System.out.println("STARE t1: "+ t1.getState());
    }
}
