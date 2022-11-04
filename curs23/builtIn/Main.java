package curs23.builtIn;

import java.util.function.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("----supplier------");
        Supplier<Double> doubleSupplier = () -> Math.random() * 100;
        Supplier<Student> studentSupplier = () -> {
            String nume = "Alex";
            String facultate = "ACS";
            return new Student(nume, facultate);
        };
        System.out.println(doubleSupplier.get());
        Student student = studentSupplier.get();
        System.out.println(student.getNume() + "  " + student.getFacultate());

        System.out.println("----consumer------");
        Consumer<String> stringConsumer = System.out::println;
        stringConsumer.accept("exemplu");
        BiConsumer<String, Student> checkStudentNameConsumer = (nume,stud) -> {
            if (stud.getNume().equals(nume)){
                System.out.println("Studentul are numele primit");
            } else {
                System.out.println("studentul nu are numele primit");
            }
        };
        checkStudentNameConsumer.accept("Alex", student);

        System.out.println("----predicate------");
        Predicate<Integer> checkParitatePredicate = i -> i % 2 == 1;
        System.out.println(checkParitatePredicate.test(4));
        BiPredicate<String, Student> checkStudentNamePredicate = (nume, stud) -> nume.equals(stud.getNume());
        String nume = "Alexe";
        System.out.println("Numele " + nume + " e numele studentului: " + checkStudentNamePredicate.test(nume,student));

        System.out.println("----function------");
        Function<String, Integer> stringLenghtFunction = x -> x.length();
        System.out.println("Lungime nume student: " + stringLenghtFunction.apply(student.getNume()));

        System.out.println("----operators------");
        UnaryOperator<String> formatStringOperator = st -> st.substring(0,1).toLowerCase() + st.substring(1).toUpperCase();
        System.out.println(formatStringOperator.apply(student.getNume()));
        BinaryOperator<String> formatStudentInfoOperator = Main::combinareInfoStudent;
        String denumireCompleta = formatStudentInfoOperator.apply(student.getNume(), student.getFacultate());
        System.out.println(denumireCompleta);

    }

    private static String combinareInfoStudent(String num, String facultate) {
        return "Studentul cu numele: " + num + " este inscris la facultatea " + facultate;
    }
}
