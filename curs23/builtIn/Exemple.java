package curs23.builtIn;

import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Exemple {

    public static void main(String[] args) {
        Random random = new Random();
        Supplier<Integer> randomSupplier = () -> random.nextInt(1998);
        System.out.println(randomSupplier.get());
        System.out.println(randomSupplier.get());

        Function<String, Integer> nrLaPatratFunction = st -> {
            int i = Integer.parseInt(st);
            return i*i;
        };
        System.out.println(nrLaPatratFunction.apply("9"));

        Predicate<Integer> checkPrim = Exemple::verificarePrim;
        Integer nr = 8;
        System.out.println("Este numarul " + nr + " prim: " + checkPrim.test(nr));
    }

    private static boolean verificarePrim(Integer input) {
        for(int i = 2; i <= input /2; i++){
            if (input %i ==0){
                return false;
            }
        }
        return true;
    }
}
