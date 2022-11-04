package curs18.exemplu;

public class Person {

    String nume;

    public Person(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    int varsta;

    public Person(String nume) {
        this.nume = nume;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                '}';
    }
}
