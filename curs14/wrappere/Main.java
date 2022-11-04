package curs14.wrappere;

public class Main {

    public static void main(String[] args) {
        int a = 12;
        Integer objectA = a;
        int b = objectA;
        System.out.println(a);
        System.out.println(objectA);

        int i = Integer.parseInt("100", 10);
        int j = Integer.parseInt("100", 2);
        // 16^0*12 + 16^1*11+ 16^2*10
        int k = Integer.parseInt("ABC", 16);

        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
    }
}
