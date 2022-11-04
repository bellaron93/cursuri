package curs22.generice;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>(10);
        Box<String> stringBox = new Box<>("Ana");
        List<Integer> integerList = new LinkedList<>();

        integerBox.getTranslatedInfo(10);
        integerBox.genericMethod("Ion", 10.9);

        showInfoFromBox(integerBox);
//        showInfoFromBox(stringBox);
    }

    private static void showInfoFromBox(Box<? super Integer> integerBox) {
        System.out.println(integerBox.getCamp());
    }
}
