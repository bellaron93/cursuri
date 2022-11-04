package curs19.list;

import curs11.mostenire.A;

import java.util.*;

public class Exercitii {

    private static final Integer nrElem = 2_000_000;

    public static void main(String[] args) {
        List<Integer> arrayStringList = new ArrayList<>();
        List<Integer> arrayStringList1 = new ArrayList<>(nrElem);
        List<Integer> linkedIntegerList = new LinkedList<>();
        List<Integer> vectorDoubleList = new Vector<>();

        calcTime(arrayStringList);
        calcTime(arrayStringList1);
        calcTime(linkedIntegerList);
        calcTime(vectorDoubleList);

        //parcurgere in doua moduri in ordine inversa
        parcurgereInversa();
    }

    private static void parcurgereInversa() {
        List<Integer> list = new ArrayList<>(20);
        for(int i = 0; i < 20; i++){
            list.add(i*i);
        }
        //prima varianta
        for(int i = 19; i >= 0; i--){
            //array[i] <=> list.get(i)
            System.out.println(list.get(i));
        }

        //a doua varianta
        System.out.println("------------");
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()){
            listIterator.next();
        }
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }

    private static void calcTime(List<Integer> list) {
        long begin = System.currentTimeMillis();
        for(int i = 0; i< nrElem; i++){
           list.add(i);
        }
   /*     for(int i = 0; i < nrElem - 1000; i+= 1000){
            System.out.println(list.get(i));
        }*/
        long end = System.currentTimeMillis();
        System.out.println(end - begin);
    }
}
