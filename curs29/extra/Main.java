package curs29.extra;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> objects = new ArrayList<>();
        objects.addAll(List.of(1,2,3,4));

        Exemplu exemplu = new Exemplu(1, objects);

        List<Integer> lista = exemplu.getLista();
        lista.add(12);
        System.out.println(exemplu.getLista());
        int a = exemplu.getA();
        a = 6;
        System.out.println(exemplu.getA());
    }
}
