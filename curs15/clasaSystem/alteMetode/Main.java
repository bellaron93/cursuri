package curs15.clasaSystem.alteMetode;

public class Main {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println("procesari de date");
        for(long i = 0; i < 1000000000; i++){
            for(long j = 0; j < 10; j++) {
                int nr = 10;
            }
           /* if(i == 1000000){
                System.exit(4);
            }*/
        }
        String java_home = System.getenv("JAVA_HOME");
        System.out.println(java_home);
        long finalTime = System.currentTimeMillis();
        System.out.println(finalTime - start);
    }
}
