package curs29.extra;

import java.util.ArrayList;
import java.util.List;

public class Exemplu {

    final int a;
    final List<Integer> lista;

    public Exemplu(int a, List<Integer> lista) {
        this.a = a;
        this.lista = lista;
    }

    public int getA() {
        return a;
    }

    public List<Integer> getLista() {
//        return lista;
        List<Integer> newlist = new ArrayList<>();
        newlist.addAll(lista);
        return newlist;
    }
}
