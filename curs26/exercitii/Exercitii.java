package curs26.exercitii;

import java.util.ArrayList;
import java.util.List;

public class Exercitii {

    public static void main(String[] args) throws InterruptedException {
        List<String> names = List.of("Ana", "Alina", "Anca", "Adina", "Adriana");
        List<String> names2 = new ArrayList<>(names);

        ViewRunnable rn = new ViewRunnable();
        rn.setNames(names2);
//        Thread thread = new Thread(new ViewRunnable(names));
        Thread thread = new Thread(rn);
        thread.start();
        Thread.sleep(20);
        names2.add("TUDOR");


        Thread thread1 = new ViewThread("Thread---", names2);
        thread1.start();


        for(int i = 0; i < 10; i++) {
            Thread thread2 = new Thread(rn);
            thread2.start();
        }
    }
}
