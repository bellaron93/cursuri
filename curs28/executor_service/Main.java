package curs28.executor_service;

import java.util.ArrayList;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        Runnable task = () -> {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+ ": Task nou de executat");
        };

        Callable<Integer> task2 = () -> {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName()+ ": Task submis pentru executie");
            return 6;
        };
        //execut acelasi task pe 4 threaduri diferite
        ExecutorService executorService = Executors.newFixedThreadPool(16);
//        ExecutorService executorService = Executors.newCachedThreadPool();
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for(int i = 0; i < 6; i++) {
            executorService.execute(task);
        }

        //execut acelasi task pe 4 threaduri diferite - folosind doar THREAD
      /*  ArrayList<Thread> threads = new ArrayList<>();
        for(int i = 0; i< 4; i++){
            threads.add(new Thread(task));
        }
        for(int i = 0; i< 4; i++){
            threads.get(i).start();
        }
        for(int i = 0; i< 4; i++){
            threads.get(i).join();
        }*/

        executorService.submit(task);
        Thread.sleep(100);
        executorService.submit(task);
        Future<Integer> futureRez = executorService.submit(task2);
        System.out.println(futureRez.isDone());
      /*  Thread.sleep(3000);
        System.out.println(futureRez.isDone());
*/
        executorService.shutdown();
        try {
            System.out.println("inchidem fortat dupa 2 secunde");
            if(!executorService.awaitTermination(2100, TimeUnit.MILLISECONDS)){
                System.out.println("au trecut cele doua secunde");
                executorService.shutdownNow();
            }

        }catch (InterruptedException e){
            executorService.shutdownNow();
        }
    }
}
