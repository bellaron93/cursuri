package curs20.queue;

import java.util.Objects;

public class Student implements Comparable<Student>{

    private String nume;
    private Integer nota;

    public Student(String nume, Integer nota) {
        this.nume = nume;
        this.nota = nota;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
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

    @Override
    public int compareTo(Student altStudent) {
        //ordinea naturala sa fie alfabetica.

        return this.getNume().compareTo(altStudent.getNume());
//        return this.getNota() - altStudent.getNota();
      /*  if(this.getNota() > altStudent.getNota()){
            return 100;
        } else if( this.getNota() < altStudent.getNota()){
            return -100;
        } else {
            return this.getNume().compareTo(altStudent.getNume());
        }*/
    }
}
