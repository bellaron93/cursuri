package curs15.clasaMath;

import java.io.Console;

public class Exercitiu {

    public static void main(String[] args) {
        System.out.println("Va rugam sa alegeti simplu sau avansat");
        Console console = System.console();
        String tipCalculator = console.readLine();

        if(!tipCalculator.equalsIgnoreCase("simplu") &&
        !tipCalculator.equalsIgnoreCase("avansat")){
            System.out.println("s-a ales un tip gresit");
            System.exit(2);
        }
        if(tipCalculator.equalsIgnoreCase("simplu") ){
            System.out.println("Optiuni: min, max, suma, diferenta");
            String operatie = console.readLine();
            while (!operatie.equals("STOP")){
                if(operatie.equals("min")){
                    System.out.println("Introdu numerele pe care vrei sa le compari");
                    String nr1 = console.readLine();
                    String nr2 = console.readLine();
                    System.out.println("Minimul este: " + Math.min(Integer.parseInt(nr1), Integer.parseInt(nr2)));
                } else if(operatie.equals("sum")){
                    System.out.println("Introdu numerele pentru care vrei sa calculezi suma");
                    String nr1 = console.readLine();
                    String nr2 = console.readLine();
                    System.out.println("Suma este: " +(Integer.parseInt(nr1) + Integer.parseInt(nr2)));
                    System.out.println(Integer.parseInt(nr1) + Integer.parseInt(nr2));
                }
                else {
                    System.out.println("Operatia nu exista");
                }
                operatie = console.readLine();
            }
        } else if(tipCalculator.equalsIgnoreCase("avansat")){
            System.out.println(("Optiuni: radical, modul, putere"));
        }
    }
}
