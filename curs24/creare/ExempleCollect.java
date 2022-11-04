package curs24.creare;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExempleCollect {

    public static void main(String[] args) {
        //set date de intrare
        List<String> javas = List.of("Javaa1", "Java2", "Javaaa3", "Javaa1");

        //colectii generale
        List<String> colectareLista = javas.stream() //procesari intermediare
                .collect(Collectors.toList());
        System.out.println(colectareLista);
        Set<String> colectareSet = javas.stream().collect(Collectors.toSet());
        System.out.println(colectareSet);

        //colectii particulare
        TreeSet<String> collect = javas.stream()
                .collect(Collectors.toCollection(() -> new TreeSet<>((x1,x2) -> {
                    return x2.length() - x1.length();
                })));
        System.out.println(collect);

        //map
        Map<String, Integer> collectMap = List.of("Javaa1", "Java2", "Javaaa3").stream()
                .collect(Collectors.toMap(e -> e.toUpperCase(), e -> e.length()));
        System.out.println(collectMap);
        System.out.println(collectMap.get("JAVAA1"));

        //groupingBy
        Map<Integer, List<String>> colectarefolosindGrupare = javas.stream()
                .collect(Collectors.groupingBy(e -> e.length()));
        System.out.println(colectarefolosindGrupare);
        //partitionare
        System.out.println(javas.stream()
                .collect(Collectors.partitioningBy(e ->{
                    return e.length() == 6;
                })));

        //joining
        System.out.println(javas.stream().collect(Collectors.joining(" si ")));
    }
}
