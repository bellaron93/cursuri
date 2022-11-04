package curs29.atomicitate;

import java.util.concurrent.atomic.AtomicInteger;

public class Task implements Runnable{

    private AtomicInteger counter = new AtomicInteger(0);

    public AtomicInteger getCounter() {
        return counter;
    }

    @Override
    public void run() {
        counter.incrementAndGet();

    }
}
