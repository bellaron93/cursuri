package curs30;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class ClaseExtraDateTimeAPI {

    public static void main(String[] args) throws InterruptedException {
        //period
        Period ofYears = Period.ofYears(2);
        Period of = Period.of(1, 5, 1);

        System.out.println(of);
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);

        System.out.println(localDate.plus(ofYears));
        System.out.println(localDateTime.minus(ofYears));
        System.out.println(Period.between(localDate, localDate.plus(of)));

        //duration
        Duration duration = Duration.ofMinutes(30);
        LocalTime now = LocalTime.now();
        LocalTime localTime1 = LocalTime.of(18, 4, 3);

        System.out.println(now.plus(duration));
        System.out.println(localTime1.minus(duration));
        System.out.println(Duration.between(localTime1, now));

        //chronoUnit
        LocalTime start = LocalTime.now();
        Thread.sleep(150);
        LocalTime end = LocalTime.now();
        System.out.println(ChronoUnit.MILLIS.between(start,end));

        LocalDateTime localDateTime1 = LocalDateTime.now();
        ZoneId bucurestiId = ZoneId.systemDefault();
        ZoneId madridId = ZoneId.of("Europe/Madrid");
        ZonedDateTime oraBucuresti = ZonedDateTime.of(localDateTime1, bucurestiId);
        ZonedDateTime oraMadrid = ZonedDateTime.of(localDateTime1, madridId);

        System.out.println(oraBucuresti);
        System.out.println(oraMadrid);
        System.out.println("madrid: " + oraBucuresti.toInstant().atZone(madridId));

        //Formatter
        String date = "24/02/2022";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println( LocalDate.parse(date, dateTimeFormatter));
        System.out.println(LocalDate.now().format(dateTimeFormatter));

        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("hh-mm-ss");
        System.out.println(LocalTime.now().format(dateTimeFormatter1));

        DateTimeFormatter shortFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        DateTimeFormatter fullFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);
        ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.now(), ZoneId.systemDefault());
        System.out.println(zonedDateTime);
        System.out.println(zonedDateTime.format(shortFormatter));
        System.out.println(zonedDateTime.format(fullFormatter));
    }
}
