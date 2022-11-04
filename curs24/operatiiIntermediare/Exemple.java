package curs24.operatiiIntermediare;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exemple {

    public static void main(String[] args) {
        List<String> numeStudenti = List.of("Ana", "Alina", "Diana", "Darius", "Alex");

        //---FILTER----
//        List<String> listaNumeA =
        Predicate<String> numeleIncepeCua = (String x) -> {
            return x.startsWith("A");
        };
        numeStudenti.stream()
                .filter(numeleIncepeCua)
                .limit(2)
            .forEach(nume -> System.out.println("Nume: " + nume));

//     TODO           .collect(Collectors.toList());
//        System.out.println(listaNumeA);

        //---LIMIT---
        Stream.iterate(0, e -> e + 3)
                .limit(10)
                .forEach(el -> System.out.println("Multiplu de 3: " + el));
    }
}
