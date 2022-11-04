package curs14.object;

import java.util.Objects;

public class Pisica {

    String nume;

    public Pisica(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        System.out.println("aici");
        return "Pisica{" +
                "nume='" + nume + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pisica pisica = (Pisica) o;
        return nume.equals(pisica.nume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume);
    }
}
