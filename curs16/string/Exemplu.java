package curs16.string;

import java.io.Console;

public class Exemplu {

    public static void main(String[] args) {
        Console console = System.console();
        System.out.println("Scrie string-ul:");
        String string = console.readLine();
        System.out.println("S-a citit stringul: " + string + " cu lungimea: " + string.length());
        System.out.println("Introdu un caracter");
        String s1 = console.readLine();
        String caracter = s1.substring(0,1);
        System.out.println("Prima aparitie a caracterului " + caracter +
                " este:" + string.indexOf(caracter) + " iar ultima este:" +
                string.lastIndexOf(caracter));
        System.out.println("Introdu indexul de la care vrei sa preiei substring:");
        String indexAsString = console.readLine();
        System.out.println("Substringul de la indexul: " + indexAsString + " este:"+
                string.substring(Integer.parseInt(indexAsString)));
    }
}
