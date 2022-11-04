package curs29.streams;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class main {

    public static void main(String[] args) {
        List<Integer> list = List.of(2, 4, 16, 8, 10, 2);

        Thread t1 = new CopilThread();
        t1.start();

        LocalTime startingTime = LocalTime.now();
        list.stream()
                .parallel()
                .filter(x -> {
                    System.out.println("FILTER: " + x + "  " + Thread.currentThread().getName());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return x%4==0;
                })
                .forEach(x ->{
                    System.out.println("FOREACH: " + x);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });

        LocalTime endTime = LocalTime.now();
        System.out.println(ChronoUnit.SECONDS.between(startingTime,endTime));
    }
}
