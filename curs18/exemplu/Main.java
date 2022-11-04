package curs18.exemplu;

public class Main {

    public static void main(String[] args) {
        Person andrei = new Person("Andrei", 12);
        Pisica luna = new Pisica("Luna");

        System.out.println("----fara genericitate----");
        BoxPersoana box1 = new BoxPersoana(andrei);
        BoxPisica box2 = new BoxPisica(luna);
        System.out.println(box2.pisica.toString());
        System.out.println(box1.person);

        System.out.println("----cu genericitate----");
        Box<Person> box1s = new Box<>(andrei);
        Box<Pisica> box2s = new Box<>(luna);
        System.out.println(box2s.camp);
        System.out.println(box1s.camp);

        System.out.println(box1s.method(andrei));
        System.out.println(Box.staticGenericMethod(1,"info"));
        System.out.println(box1s.nonStaticGenericMethod("info", andrei));
    }
}
