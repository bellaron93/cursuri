package curs29.executor_service;

import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExercitiiDelay {

    public static void main(String[] args) {

        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        Runnable task = ()-> {
            System.out.println(LocalTime.now() + " Incep executia");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
//            System.out.println(LocalTime.now() + " Termin executia");
        };
        System.out.println(LocalTime.now());
//        scheduledExecutorService.schedule(task, 2, TimeUnit.SECONDS);
//        scheduledExecutorService.scheduleAtFixedRate(task, 1, 2,TimeUnit.SECONDS);
//        scheduledExecutorService.scheduleWithFixedDelay(task, 1, 2,TimeUnit.SECONDS);
        scheduledExecutorService.shutdown();
    }
}
