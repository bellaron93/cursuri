package curs29.executor_service;

import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class Exercitii {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        //executor service cu un numar de threaduri
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        Runnable task = () -> {
            System.out.println("NUME THREAD: " + Thread.currentThread().getName());
        };
//        executaTask(executorService,task);
//        executaCallableTask(executorService);
        Callable<Integer> taskCallable = ()->{
            Random random = new Random();
            int rez = random.nextInt(2000);
            System.out.println("Threadul " + Thread.currentThread().getName() + " si durata " + rez);
            Thread.sleep(rez);
            return rez;
        };
//        executaInvokeallTask(executorService, List.of(taskCallable, taskCallable, taskCallable));
//        executaInvokeAnyTask(executorService, List.of(taskCallable, taskCallable, taskCallable));

        executorService.shutdown();
    }

    private static void executaInvokeallTask(ExecutorService executorService, List<Callable<Integer>> taskCallable) throws InterruptedException {
        List<Future<Integer>> futures = executorService.invokeAll(taskCallable);
        futures.stream()
                .forEach(x -> {
                    try {
                        System.out.println(x.get());
                    } catch (InterruptedException e) {

                    } catch (ExecutionException e) {
                        e.printStackTrace();
                    }
                });
    }

    private static void executaInvokeAnyTask(ExecutorService executorService, List<Callable<Integer>> taskCallable) throws InterruptedException, ExecutionException {
        Integer integer = executorService.invokeAny(taskCallable);
        System.out.println(integer);
    }

    private static void executaCallableTask(ExecutorService executorService) throws ExecutionException, InterruptedException {
        Callable<Integer> task = ()->{
            Thread.sleep(1000);
            return 2;
        };
        Future<Integer> rezultat = executorService.submit(task);
        System.out.println(rezultat.get());

    }

    private static void executaTask(ExecutorService executorService, Runnable task) throws InterruptedException {
        executorService.execute(task);
        Future<?> rezultat = executorService.submit(task);
       Thread.sleep(100);
        System.out.println(rezultat.isDone());

    }
}
