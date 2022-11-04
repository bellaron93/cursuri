package curs20.queue;

import java.util.Comparator;

public class ComparatorDescNota implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o2.getNota() - o1.getNota();
    }
}
