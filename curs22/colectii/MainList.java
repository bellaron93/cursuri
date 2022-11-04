package curs22.colectii;

import java.util.*;

public class MainList {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(20);
       //ArrayList<Integer> num2 = new ArrayList<>(20);
  /*      List<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        stack2.push(2);
        stack1.add(2);
        stack2.add(2);*/
        Random random = new Random();
        for(int i = 0; i< 20; i++){
            numbers.add(random.nextInt(10));
        }
        System.out.println(numbers);
        procesareList(numbers);
        procesareOkList(numbers);
        List<Integer> newLinkedList = new LinkedList<>(numbers);
        System.out.println(newLinkedList);
    }

    private static void procesareOkList(List<Integer> numbers) {
        ListIterator<Integer> listIterator = numbers.listIterator();
        while (listIterator.hasNext()){
            Integer value = listIterator.next();
            if(value%2 == 0){
                listIterator.remove();
            }else {
                listIterator.set(value+1);
            }
        }
        System.out.println(numbers);
    }

    private static void procesareList(List<Integer> numbers) {
        for(int i =0; i< numbers.size(); i++){
            if(numbers.get(i)%2 ==0){
                numbers.remove(i);
                i--;
            }
        }
        System.out.println(numbers);
    }
}
