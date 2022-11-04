package curs25.stream_operatii;

import java.util.Objects;

public class Student {

    private String nume;
    private Integer nota;

    public Student(String nume, Integer nota) {
        this.nume = nume;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nume='" + nume + '\'' +
                ", nota=" + nota +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(nume, student.nume) && Objects.equals(nota, student.nota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume, nota);
    }

    public String getNume() {
        return nume;
    }

    public Integer getNota() {
        return nota;
    }
}
