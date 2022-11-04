package curs19.list;

import java.util.Objects;

public class Fruct {

    private String nume;

    public Fruct(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruct fruct = (Fruct) o;
        return Objects.equals(nume, fruct.nume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume);
    }

    @Override
    public String toString() {
        return "Fruct{" +
                "nume='" + nume + '\'' +
                '}';
    }
}
