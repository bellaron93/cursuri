package curs16.StringBuilderBuffer;

public class Main {

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder(100);
        StringBuilder sb3 = new StringBuilder("exemplu");

        System.out.println(sb2.capacity());
        System.out.println(sb3.length());
        sb3.append(" principal");
        System.out.println(sb3);
        sb3.insert(0, "altceva ");
        System.out.println(sb3);
        System.out.println(sb3.reverse());
    }
}
