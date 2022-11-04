package curs25.stream_operatii;

import java.util.List;
import java.util.stream.Stream;

public class Exemple {

    public static void main(String[] args) {
        Stream.iterate(0, e -> e + 3)
                .limit(10)
                .forEach(el -> System.out.println("Multiplu de 3: " + el));

        // ---- TAKEWHILE-----
        Stream.iterate(0, e -> e+3)
                .takeWhile(el -> {
                    return el < 10;
                })
                .forEach(el -> System.out.println(el));

        // -----DISTINCT-----
        List<Student> students = List.of(new Student("Andrei", 9), new Student("Alex", 7), new Student("Maria", 10), new Student("Alex", 7));

        students.stream()
                .distinct()
                .forEach(student -> System.out.println(student.toString()));

        //----SORTED----
        students.stream()
                .sorted((e1,e2) -> e1.getNota() - e2.getNota())
                .forEach(student -> System.out.println("Student: " + student));
        //TODO alternativa cu operatie finala

        //-----MAP----
        long nrNoteMari = students.stream()
                .map(student ->  student.getNota())
                .filter(nota -> nota > 7)
                .count();
        System.out.println("Nr note mari: " + nrNoteMari);
        students.stream()
                .map(student -> new Student(student.getNume(), student.getNota()+1))
                .forEach(newStudent -> System.out.println("Student nou: " + newStudent));
    }
}
