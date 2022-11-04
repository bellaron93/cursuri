package curs20.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ExempluSimpluSet {

    public static void main(String[] args) {
        Set<String> nume1 = new LinkedHashSet<>();
        Set<String> nume2 = new HashSet<>();

        nume1.add("Andrei");
        nume1.add("Mihai");
        nume1.add("Marian");
        nume1.add("Marian");

        nume2.add("Andrei");
        nume2.add("Mihai");
        nume2.add("Marian");

        for(String nume: nume1){
            System.out.println(nume);
        }
        System.out.println("Simple hash set");
        for(String nume: nume2){
            System.out.println(nume);
        }
    }
}
