package curs16.random;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();
        for(int i = 0; i < 20; i++) {
            System.out.println(rand.nextBoolean());
        }
        int age = rand.nextInt(100);
        System.out.println("Varsta: "+ age);
        if(age < 18){
            System.out.println("minor");
        } else {
            System.out.println("majora");
        }
    }
}
