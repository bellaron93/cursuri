package curs25.optional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Exemple {

    public static void main(String[] args) {
        List<String> nume = List.of("Alex", "Dianaaaaaa", "Dan", "Mihai");
        List<String> nume2 = List.of();
        Optional<String> max = nume.stream().max((s1, s2) -> s1.length() - s2.length());
/*        if(max.isPresent()){
            System.out.println(max.get());
        }*/
        max.ifPresent(numeLung -> System.out.println(numeLung));


        String longestName = max.orElse("Nu exista nume lung");
        String longestNameSupplier = max.orElseGet(() -> "Nu exista");
        String longestNameException = max.orElseThrow(() -> new ArithmeticException());
        System.out.println("Cel mai lung nume: " +longestName);
        System.out.println("Cel mai lung nume: " +longestNameSupplier);
        System.out.println("Cel mai lung nume: " +longestNameException);

        Optional<String> isReallyLong = max.filter(word -> word.length() > 8);
        if(isReallyLong.isPresent()) {
            System.out.println(isReallyLong.get());
        }
    }
}
