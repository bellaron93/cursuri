package curs22.colectii;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Companie thales = new Companie("Thales", 5000);
        Companie orange = new Companie("Orange", 7000);
        List<Companie> companieList = List.of(
                new Companie("Dacia", 200),
                thales,
                orange,
                orange
                );
        Queue<Companie> companies = new PriorityQueue<>(companieList);
        System.out.println(companies);
        afisareCoada(companies);

        System.out.println("----coada dupa nr de angajati-----");
        Queue<Companie> companies2 = new PriorityQueue<>(new ComparatorByNrAngajati());
        companies2.addAll(companieList);
        afisareCoada(companies2);

        System.out.println("---coada afisata din ambele capete----");
        companies.addAll(companieList);
        Queue<Companie> arrayDequeue = new ArrayDeque<>(companies);

        System.out.println("---set care retine alfabetic----");
        TreeSet<Companie> companiiSet = new TreeSet<>(companies);
        companiiSet.add(new Companie("Luxoft", 2000));
        System.out.println(companiiSet);
        for( Companie c: companiiSet){
            System.out.println(c);
        }
        SortedSet<Companie> companies1 = companiiSet.headSet(orange);
        System.out.println(companies1);
        System.out.println("---alta afisare----");
        while (!companiiSet.isEmpty()){
            System.out.println(companiiSet.pollFirst());
        }

        System.out.println("---Exercitiu MAP-----");
        Map<String, Companie> ceoToCompany = new TreeMap<>();
        ceoToCompany.put("Alex", orange);
        ceoToCompany.put("Andrei", thales);
        ceoToCompany.put("Adrian", new Companie("Dacia", 200));

        for (Map.Entry<String,Companie> entry: ceoToCompany.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println(ceoToCompany.containsKey("Ion"));
        System.out.println(ceoToCompany.containsValue(new Companie("Dacia", 200)));
        System.out.println(ceoToCompany.containsValue(thales));


    }

    private static void afisareCoada(Queue<Companie> companies) {
        while (!companies.isEmpty()){
            System.out.println(companies.poll());
        }
    }
}
