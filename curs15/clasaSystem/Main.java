package curs15.clasaSystem;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.print("Ana ");
        System.out.println(" are mere");
        System.out.println(".");
        System.err.println("eroare");
        //citire
        byte[] bytes = new byte[10];
        System.in.read(bytes);
        System.out.println(bytes);
        System.out.println(new String(bytes));
    }
}
