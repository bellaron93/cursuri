package curs29.streams;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Random;
import java.util.stream.Stream;

public class Exercitiu {

    public static void main(String[] args) {

        boolean ePrim = prim(10);

        Random random = new Random(1);
        LocalTime startingTime = LocalTime.now();
        Stream.generate(()->random.nextInt(1_000_000))
                .limit(100_000)
                .parallel()
                .forEach(x-> {
                    System.out.println("Numarul " + x + " este prim: " + prim(x));
                });

        LocalTime endTime = LocalTime.now();
        System.out.println(ChronoUnit.MILLIS.between(startingTime,endTime));
    }

    private static boolean prim(int n) {
        for(int i = 2; i<= n/2; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
