package curs20.queue;

import java.util.*;

public class MainPriorityQueue {

    public static void main(String[] args) {
        Queue<String> objects = new LinkedList<>();
        List<String> objects2 = new LinkedList<>();

        Queue<Integer> nume = new PriorityQueue<>();
        nume.offer(12);
        nume.offer(7);
        nume.offer(14);
       /* Iterator<String> iterator = nume.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }*/
        while (!nume.isEmpty()){
            System.out.println(nume.poll());
        }

        System.out.println("coada de prioritati cu studenti");
        exercitiuOrdineNaturala();
        System.out.println("coada de prioritati cresc");
        exercitiuPrioritateCustom();
    }

    private static void exercitiuOrdineNaturala() {
        Queue<Student> students = new PriorityQueue<>();
        students.offer(new Student("Cristi", 9));
        students.offer(new Student("Andrei", 10));
        students.offer(new Student("Alex", 9));

        while (!students.isEmpty()){
            System.out.println(students.poll());
        }
    }

    private static void exercitiuPrioritateCustom() {
        Queue<Student> students = new PriorityQueue<>(new ComparatorDescNota());
        students.offer(new Student("Cristi", 9));
        students.offer(new Student("Andrei", 10));
        students.offer(new Student("Alex", 9));

        while (!students.isEmpty()){
            System.out.println(students.poll());
        }
    }
}
