package curs16.scanner;

import java.util.Objects;

public class Student {

    String numeStudent;
    int varsta;

    public Student(String numeStudent, int varsta) {
        this.numeStudent = numeStudent;
        this.varsta = varsta;
    }

    @Override
    public String toString() {
        return "Student{" +
                "numeStudent='" + numeStudent + '\'' +
                ", varsta=" + varsta +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return varsta == student.varsta && Objects.equals(numeStudent, student.numeStudent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeStudent, varsta);
    }
}
