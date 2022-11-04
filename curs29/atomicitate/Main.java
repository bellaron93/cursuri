package curs29.atomicitate;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        List<Thread> threads = new ArrayList<>();
        Task task = new Task();
        for(int i = 0; i < 10;i++){
            threads.add(new Thread(task));
        }
        for(int i = 0; i < 10;i++){
           threads.get(i).start();
        }
        for(int i = 0; i < 10;i++){
            threads.get(i).join();
        }
        System.out.println("REZULTAT FINAL: " + task.getCounter());
    }
}
