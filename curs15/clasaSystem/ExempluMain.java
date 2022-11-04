package curs15.clasaSystem;

import java.io.IOException;

public class ExempluMain {

    public static void main(String[] args) throws IOException {
        System.out.println("Introdu varsta: ");
        byte[] bytes = new byte[2];
        System.in.read(bytes);
        int i = Integer.parseInt(new String(bytes));
        if(i < 18){
            System.out.println("esti minor");
        } else {
            System.out.println("esti major");
        }
    }
}
