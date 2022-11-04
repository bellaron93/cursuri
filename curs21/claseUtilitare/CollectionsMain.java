package curs21.claseUtilitare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class CollectionsMain {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(5);
        numbers.add(12);

        /*TreeSet<Integer> integers = new TreeSet<>();
        integers.addAll(numbers);
        for(Integer elem: integers){
            System.out.println(elem);
        }*/

        Collections.sort(numbers);
        System.out.println(numbers);
        System.out.println(Collections.max(numbers));

        Collections.replaceAll(numbers, 5, 9);
        System.out.println(numbers);
        Collections.reverse(numbers);
        System.out.println(numbers);

        List<Integer> integers = List.of(1, 2, 6, 4);
        System.out.println(integers);
    }
}
