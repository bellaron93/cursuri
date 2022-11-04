package curs28.probleme_sincronizare;

public class Deadlock {

    public static final Object RESURSA1 = new Object();
    public static final Object RESURSA2 = new Object();


    public static void main(String[] args) {
        Thread thread1 = new Thread1("Proces 1");
        Thread thread2 = new Thread2("Proces 2");
        thread1.start();
        thread2.start();
    }
}
