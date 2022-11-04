package curs29.colectii;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {

    public static void main(String[] args) {

        //colectie concurenta
        CopyOnWriteArrayList<Integer> objects = new CopyOnWriteArrayList<>();
        objects.add(1);
        objects.add(4);
        objects.stream().forEach(x-> System.out.println(x));

        //colectie nemodificabila
        ArrayList<Integer> integers = new ArrayList<>(objects);
        List<Integer> unmodifiableList = Collections.unmodifiableList(integers);
//        unmodifiableList.add(12);
        // sincronizata
        List<Integer> synchronizedList = Collections.synchronizedList(integers);
        synchronizedList.add(12);
        System.out.println(synchronizedList);
    }
}
