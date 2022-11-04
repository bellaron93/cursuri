package curs15.clasaSystem.console;

import java.io.Console;

public class Main {

    public static void main(String[] args) {
        Console console = System.console();
        System.out.println("Introdu numele si apasa enter:  ");
        String nume = console.readLine();
        System.out.println("Introdu parola ta: ");
        char[] chars = console.readPassword();
        System.out.println("Numele tau este: " +nume);
        System.out.println("parola este: " + chars.toString());
    }
}
