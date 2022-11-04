package curs25.optional;

import java.util.List;
import java.util.Optional;

public class Exercitiu {

    public static void main(String[] args) {
        List<Person> people = List.of(new Person("Andrei", "074"),
                new Person("Mihai", "073"),
                new Person("Alex", "072"));

        Exercitiu ex = new Exercitiu();
        Optional<Person> personOptional = ex.findByPhoneNumber("072", people);
        personOptional.ifPresent((person) -> System.out.println(person));
    }

   Optional<Person> findByPhoneNumber(String phoneNumber, List<Person> people){
       return people.stream()
               .filter(person -> person.getPhoneNumber().equals(phoneNumber))
               .findFirst();
   }
}
