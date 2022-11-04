package curs16.string;

public class Main {

    private final static int MAX = 1_100_000_000;
    public static void main(String[] args) {
        String s1 = "exemplu string";
        String s2 = "alt exemplu   ";

        s1 += " pentru incepatori";
        String s3 = new String("exemplu string");
        String s4 = "exemplu string";

        System.out.println(s1);
        System.out.println(s1.length());
        System.out.println(s1.charAt(1));
        System.out.println(s1.substring(7,14));
        System.out.println(s1.substring(8));
        System.out.println(s1.indexOf('y'));
        System.out.println(s1.indexOf("i"));
        System.out.println(s1.lastIndexOf("i"));
        System.out.println(s1.substring(0,3).toUpperCase());
        System.out.println(s2 + ".");
        System.out.println(s2.trim() + ".");
        System.out.println(s2.replace('e', 'i'));
        String[] cuvinte = s1.split(" ");
        for(String s: cuvinte){
            System.out.println(s);
        }
        System.out.println(s1.contains("exemplu"));
       /* test1();
        test2();*/
        String s = String.valueOf(12);
        System.out.println(String.valueOf(12) + 14);
        System.out.println(12 + 14);

    }

    private static void test1() {
        long start = System.currentTimeMillis();
        int i = 0;
        while (i < MAX){
            String a = "incercare";
            i++;
        }
        long finalTime = System.currentTimeMillis();
        System.out.println("Timp executie: " + ( finalTime - start));
    }

    private static void test2() {
        long start = System.currentTimeMillis();
        int i = 0;
        while (i < MAX){
            String a = new String("incercare");
            i++;
        }
        long finalTime = System.currentTimeMillis();
        System.out.println("Timp executie: " + ( finalTime - start));
    }
}
