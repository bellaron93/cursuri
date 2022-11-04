package curs30;

import java.time.*;

public class DateTimeAPIExample {

    public static void main(String[] args) {

//        dateAPIInfo();
//        timeAPIInfo();
//        localDateTimeApiExemplu();
        ZoneId of = ZoneId.of("Europe/Monaco");
        System.out.println(of);
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);
        ZoneId.getAvailableZoneIds().forEach(zoneid -> System.out.println("ZONE ID: " + zoneid));

        ZonedDateTime zoneDateTime1 = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Europe/Monaco"));
        System.out.println(zoneDateTime1);
        System.out.println(ZonedDateTime.now());
    }

    private static void localDateTimeApiExemplu() {
        LocalTime nowTime = LocalTime.now();
        LocalDate nowDate = LocalDate.now();
        LocalDateTime nowDatetime = LocalDateTime.now();
        System.out.println(nowDatetime);
        LocalDateTime localDateTime = LocalDateTime.of(nowDate, nowTime);
        System.out.println(localDateTime);
        System.out.println(nowDatetime.isBefore(localDateTime));
        System.out.println(LocalDateTime.parse("2022-10-05T18:50:24"));
    }

    private static void timeAPIInfo() {
        System.out.println(LocalTime.now());
        LocalTime oftime = LocalTime.of(22, 30, 20);
        LocalTime parse = LocalTime.parse("20:45");
        System.out.println(oftime);
        System.out.println(parse);

        System.out.println(oftime.isAfter(LocalTime.now()));
        System.out.println(oftime.plusSeconds(50));
        System.out.println(oftime.withSecond(45));
    }

    private static void dateAPIInfo() {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        LocalDate integersToDate = LocalDate.of(2022, 02, 24);
        LocalDate stringToDate = LocalDate.parse("2022-10-05");
        System.out.println(integersToDate);
        System.out.println(stringToDate);
        //metode
        System.out.println(now.isAfter(integersToDate));
        Month month = integersToDate.getMonth();
        System.out.println(month);
        LocalDate minusMonths = integersToDate.minusMonths(1);
        System.out.println(minusMonths.getMonth());
        LocalDate withYear = integersToDate.withYear(1998);
        System.out.println(withYear.getYear());
        System.out.println(integersToDate.getDayOfWeek());
    }
}
