package curs22.colectii;

import java.util.Comparator;

public class ComparatorByNrAngajati implements Comparator<Companie> {
    @Override
    public int compare(Companie o1, Companie o2) {
        return o1.getNumarAngajati() - o2.getNumarAngajati();
    }
}
