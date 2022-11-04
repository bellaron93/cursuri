package curs29.executor_service;

import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);
        ScheduledExecutorService singleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        Runnable task = ()-> {
            try {
                Random random = new Random();
                int timpExecutie = random.nextInt(1000)+1000;
                System.out.println(timpExecutie);
                Thread.sleep(timpExecutie);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("task de executat");
        };
        System.out.println("submitem taskul");
        scheduledExecutorService.schedule(task, 1, TimeUnit.SECONDS);

        System.out.println("executare la o perioada fixa");
//        singleThreadScheduledExecutor.scheduleAtFixedRate(task, 100, 450, TimeUnit.MILLISECONDS);
        singleThreadScheduledExecutor.scheduleWithFixedDelay(task, 100, 1000, TimeUnit.MILLISECONDS);


        //inchidere
//        scheduledExecutorService.shutdown();
    }
}
