package curs22.colectii;

import java.util.Objects;

public class Companie implements Comparable<Companie>{

    private String nume;
    private Integer numarAngajati;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Companie companie = (Companie) o;
        return Objects.equals(nume, companie.nume) && Objects.equals(numarAngajati, companie.numarAngajati);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume, numarAngajati);
    }

    public Companie(String nume, Integer numarAngajati) {
        this.nume = nume;
        this.numarAngajati = numarAngajati;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Integer getNumarAngajati() {
        return numarAngajati;
    }

    public void setNumarAngajati(Integer numarAngajati) {
        this.numarAngajati = numarAngajati;
    }

    @Override
    public int compareTo(Companie o) {
        return this.nume.compareTo(o.getNume());
    }

    @Override
    public String toString() {
        return "Companie{" +
                "nume='" + nume + '\'' +
                ", numarAngajati=" + numarAngajati +
                '}';
    }
}
