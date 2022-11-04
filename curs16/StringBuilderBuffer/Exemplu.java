package curs16.StringBuilderBuffer;

public class Exemplu {
    private static final int NR_CONCAT = 100_000;
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("util");
        sb.append("package");
        sb.insert(0, "java");
        sb.append(" este pachetul importat automat");

        System.out.println(sb);
        sb.replace(4,8, "lang");
        System.out.println(sb);
        sb.insert(4, ".");
        sb.insert(9, ".");
        System.out.println(sb);

        concatenareString();
        concatenareStringBuilder();
    }

    private static void concatenareStringBuilder() {
        long start = System.currentTimeMillis();
        int i = 0;
        StringBuilder a = new StringBuilder("a");
        while (i < NR_CONCAT){
            a.append("a");
            i++;
        }
        long timpFinal = System.currentTimeMillis();
        System.out.println("Timp executie: " + ( timpFinal - start));

    }

    private static void concatenareString() {
        long start = System.currentTimeMillis();
        int i = 0;
        String a = "a";
        while (i < NR_CONCAT){
//            a = a.concat("a");
            a+="a";
            i++;
        }
        long timpFinal = System.currentTimeMillis();
        System.out.println("Timp executie: " + ( timpFinal - start));
    }
}
