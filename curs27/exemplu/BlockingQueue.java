package curs27.exemplu;

import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue<T> {

    private Queue<T> queue = new LinkedList<T>();
    private int capacity;

    public BlockingQueue(int capacity) {
        this.capacity = capacity;
    }

    public synchronized T stergere() throws InterruptedException {
        //cat timp nu pot intoarce un element => coada e goala
        while (queue.isEmpty()){
            System.out.println(Thread.currentThread().getName() + " asteapta sa se aseze o persoana la coada");
            wait();
        }
        T element = queue.remove();
        System.out.println("-----A fost procesata persoana " + element + " de catre casierul " + Thread.currentThread().getName());
        notify();
        return element;

    }
    public synchronized void adaugare(T element) throws InterruptedException {
        //cat timp nu pot sa pun => deja e full
        while (queue.size() == capacity){
            System.out.println(Thread.currentThread().getName() + " astepta sa fie scoasa din coada o persoana");
            wait();
        }
        //nu mai trebuie sa asteptam
        queue.offer(element);
        System.out.println("++++++a fost adaugata la coada persoana  " + element);
        notifyAll();
    }
}
