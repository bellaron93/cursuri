package curs30;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class ExercitiiSet2 {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate dataNastere = LocalDate.of(1998, 2, 24);

        long between = ChronoUnit.MONTHS.between(dataNastere,now);
        //TODO de facut cu saptamani si zile
        System.out.println(between);

        LocalTime pranz = LocalTime.of(12, 30, 30);
        LocalTime cina = LocalTime.of(18, 30, 40);
        System.out.println(ChronoUnit.HOURS.between(pranz,cina));
        //TODO pentru minute si secunde

        String data = "24-02-1998";
        //rezultat:02 24 1998
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate localDate = LocalDate.parse(data, dateTimeFormatter);
        System.out.println(localDate);
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("dd MM yyyy");
        System.out.println(localDate.format(dateTimeFormatter1));

        //ora pentru alt zoneId
        ZonedDateTime oraStart = ZonedDateTime.of(LocalDateTime.now(), ZoneId.systemDefault());
        ZoneId madrid = ZoneId.of("Europe/Madrid");
        System.out.println(oraStart.toInstant().atZone(madrid));
    }
}
