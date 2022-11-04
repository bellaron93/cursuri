package curs30;

import java.time.*;

public class Exercitii {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate born = LocalDate.of(1998, 2, 24);
        System.out.println(born.minusMonths(9));

        LocalTime pranz = LocalTime.of(12, 30);
        LocalTime cina = LocalTime.parse("18:30");
        System.out.println(pranz.isBefore(cina));

        ZonedDateTime zonedDateTime = ZonedDateTime.of(now, pranz, ZoneId.systemDefault());
        ZonedDateTime zonedDateTime1 = ZonedDateTime.of(now, pranz, ZoneId.of("Europe/Monaco"));
        System.out.println(zonedDateTime);
        System.out.println(zonedDateTime1);

    }
}
