package curs18.exemplu;

public class Pisica {

    String nume;

    public Pisica(String nume) {
        this.nume = nume;
    }

    public Pisica() {
    }

    @Override
    public String toString() {
        return "Pisica{" +
                "nume='" + nume + '\'' +
                '}';
    }
}
