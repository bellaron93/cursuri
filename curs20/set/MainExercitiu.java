package curs20.set;

import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class MainExercitiu {

    public static void main(String[] args) {
//        TreeSet<Persoana>
        TreeSet<String> persoane = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        String nume = sc.nextLine();

        while (!nume.equalsIgnoreCase("stop")){
            if(!persoane.contains(nume)){
                persoane.add(nume);
                System.out.println("a fost adaugat cu succes");
            } else {
                System.out.println("exista deja");
            }
            nume = sc.nextLine();
        }

        System.out.println("Introdu una din comenzi: display, first, last, head, tail");
        String[] comenzi = sc.nextLine().split(" ");
        while (!comenzi[0].equalsIgnoreCase("stop")){
            switch (comenzi[0]){
                case "first": {
                    System.out.println(persoane.first());
                    break;
                }
                case "last" : {
                    System.out.println(persoane.last());
                    break;
                }
                case "head": {
                    SortedSet<String> nume1 = persoane.headSet(comenzi[1]);
                    System.out.println(nume1);
                    break;
                }

            }
            comenzi = sc.nextLine().split(" ");
        }
    }
}
