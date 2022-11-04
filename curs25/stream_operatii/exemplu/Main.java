package curs25.stream_operatii.exemplu;

import curs11.mostenire.B;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        //3 autori
        List<String> autori = List.of("Alex", "John", "Mike");
        List<Book> books = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i < 11; i++){
            String author = autori.get(random.nextInt(autori.size()));
            books.add(new Book(author, "carte"+i,random.nextDouble() * 100));
        }
        books.stream()
                .forEach(book -> System.out.println(book));

        books.stream()
                .filter(book -> book.getAuthor().equals("Alex"))
                .forEach(book -> System.out.println("CARTE ALEX: " + book));

        books.stream()
                .filter(book -> book.getPrice() > 50)
                .filter(book -> book.getAuthor().equals("Mike"))
                .forEach(book -> System.out.println("CARTE MIKE: " + book));

        Map<String, List<String>> cartiGrupate = books.stream()
                .collect(Collectors.groupingBy(book -> book.getAuthor(),
                        Collectors.mapping(book -> book.getName(), Collectors.toList())));
        System.out.println(cartiGrupate);

        //solutie muncitoreasca
       /* cartiGrupate.entrySet()
                .stream()
                .forEach(pair -> {
                    System.out.print(pair.getKey() + ": ");
                    pair.getValue().forEach(book -> System.out.print(book.getName() + " "));
                    System.out.println();
                });*/

        books.stream()
                .map(book -> {
                    if(!book.getAuthor().equals("John")){
                        book.setPrice(book.getPrice()*1.1);
                    }
                    return book;
                })
                .forEach(book -> System.out.println("CARTI: " + book));
    }
}
