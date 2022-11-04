package curs12.enums.exemple;

import static curs12.enums.exemple.PizzaStatus.DELIVERED;
import static curs12.enums.exemple.PizzaStatus.READY;

public class Main {

    public static void main(String[] args) {
        System.out.println(READY.getTimeToDeliver());
        System.out.println(READY.isDelivered());
        System.out.println(DELIVERED.isDelivered());
    }
}
