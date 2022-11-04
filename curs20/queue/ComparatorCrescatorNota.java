package curs20.queue;

import java.util.Comparator;

public class ComparatorCrescatorNota implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getNota() - o2.getNota();
    }
}
