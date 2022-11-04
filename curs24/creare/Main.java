package curs24.creare;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        //obtinere stream-uri
        Stream<String> curs = Stream.of("java", "curs", "programare");
        List<Integer> integerList = List.of(1, 2, 3, 4);
        Stream<Integer> integerStream = integerList.stream();

        //OPERATII TERMINALE
        //---foreach----
        curs.forEach((String el) -> {
            System.out.println("Elementul: " + el);
        });
        //---count---
        curs = Stream.of("java", "curs", "programare");
        long count = curs.count();
        System.out.println("Rezultat operatie count: " + count);
        //---x-match---
        Predicate<Integer> maiMareCaDoi = el -> {
            return el > 2;
        };
        System.out.println(maiMareCaDoi.test(4));
        boolean toateElemMaiMari = integerList.stream().allMatch(maiMareCaDoi);
        System.out.println("Sunt toate elementele mai mari decat 2?: " + toateElemMaiMari);
        boolean celPutinUnu = integerList.stream().anyMatch(maiMareCaDoi);
        System.out.println("Cel putin un elem mai mare decat 2: "+ celPutinUnu);

        //---min&max---
        List<String> listaCuvinte = List.of("java", "curs", "programare");
        Optional<String> celMaiLungString = listaCuvinte.stream().max((el1, el2) -> el1.length() - el2.length());
        Optional<String> celMaiLungString2 = listaCuvinte.stream().max(new ComparatorByLenght());
        System.out.println("Cel mai lung string este: " + celMaiLungString.get());
        System.out.println("Cel mai lung string este: " + celMaiLungString2.get());

        //---reduce---
        Optional<String> concatenare = listaCuvinte.stream().reduce((e1, e2) -> {
                    return e1 + " si " + e2;
                }
        );
        System.out.println(concatenare.get());
        Integer suma = integerList.stream().reduce(0, (integer, integer2) -> {
            return integer + integer2;
        });
        System.out.println(suma);
        //INFINITE STREAM
        createInfiniteStreams();
    }

    private static void createInfiniteStreams() {
        Stream<Integer> iterate = Stream.iterate(0, (Integer el) -> {
            return el + 2;
        });
        Stream<Double> generate = Stream.generate(() -> {
            return Math.random()*10;
        });

       /* iterate.forEach((Integer el) -> {
            System.out.println("Elementul: " + el);
        });*/
    }
}
