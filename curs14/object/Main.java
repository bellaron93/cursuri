package curs14.object;

public class Main {

    public static void main(String[] args) {
        Pisica luna = new Pisica("Luna");
        Object tomi = new Pisica("Tomi");
        System.out.println(luna.toString());
        System.out.println(tomi.toString());
        System.out.println("-----------------------------");
        Person alex = new Person(24,"Alex", "1111111111111");
        System.out.println(alex.toString());

        System.out.println("------------EQUALS---------");
        Pisica luna2 = luna;
        Pisica luna3 = new Pisica("Luna");
        System.out.println(luna == luna2);
        System.out.println(luna == luna3);
        System.out.println(luna.equals(luna2));
        System.out.println(luna.equals(luna3));
        Person alex2 = new Person(24,"Alex", "1111111111111");
        Person alex3 = new Person(25,"Alex", "1111111111111");
        System.out.println("Comparatie alex si alex2: " +alex.equals(alex2));
        System.out.println("Comparatie alex3 si alex2: " +alex2.equals(alex3));

        System.out.println("------------HASHCODE---------");
        alex.setPrenume("Alexandru");
        alex2.setPrenume("Andrei");
        System.out.println("Comparatie alex si alex2: " +alex.equals(alex2));
        System.out.println("Hashcode Alex:  " + alex.hashCode());
        System.out.println("Hashcode Alex2: " + alex2.hashCode());
        System.out.println("Hashcode Alex3: " + alex3.hashCode());
    }
}
