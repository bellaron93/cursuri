package curs16.scanner;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        int i = sc.nextInt();
        boolean b = sc.nextBoolean();
        System.out.println(s1 + " " + i + " " + b);
    }
}
