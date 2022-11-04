package curs24.creare;

import java.util.Comparator;

public class ComparatorByLenght implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}
