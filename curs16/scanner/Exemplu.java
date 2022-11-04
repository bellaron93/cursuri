package curs16.scanner;

import java.util.Scanner;

public class Exemplu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String comanda = scanner.nextLine();
        while (!comanda.equalsIgnoreCase("start")){
            System.out.println("te rog introdu comanda START");
            comanda = scanner.nextLine();
        }
        Student[] students = new Student[2];
        System.out.println("ADD, AFISEAZA, EXIT");
        comanda = scanner.nextLine();
        int i = 0;
        while (!comanda.equalsIgnoreCase("exit")){
            if(comanda.equalsIgnoreCase("afiseaza")){
                for (Student s: students){
                    System.out.println(s);
                }
            } else if(comanda.equalsIgnoreCase("add")){
                System.out.println("Introdu nume si varsta");
                String nume = scanner.next();
                int varsta = scanner.nextInt();
                scanner.nextLine();
                Student s1 = new Student(nume, varsta);
                boolean eDeja = false;
                for(Student s: students){
                    if(s != null && s1.equals(s)){
                        eDeja = true;
                        break;
                    }
                }
                if(eDeja){
                    System.out.println("E deja introdus");
                } else {
                    students[i] = s1;
                    i++;
                }
            } else {
                System.out.println("Introdu o comanda valida");
            }
            comanda = scanner.nextLine();
        }
    }
}
