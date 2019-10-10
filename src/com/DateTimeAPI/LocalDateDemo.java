package com.DateTimeAPI;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Set;

public class LocalDateDemo {

  public static void main(String[] args) {
    LocalDate localDate = LocalDate.now();
    System.out.println(localDate);

    LocalDate.of(2015, 02, 05);
    LocalDate.parse("2015-12-03");

    LocalDate tmw = LocalDate.now().plusDays(1);
    System.out.println(tmw);

    LocalDate previous = LocalDate.now().minus(1, ChronoUnit.MONTHS);
    System.out.println(previous);

    DayOfWeek sunday = LocalDate.parse("2016-06-12").getDayOfWeek();
    System.out.println(sunday);

    int twelve = LocalDate.parse("2016-06-12").getDayOfMonth();
    System.out.println(twelve);

    LocalDateTime beginningofDay = LocalDate.parse("2016-06-12").atStartOfDay();
    System.out.println(beginningofDay);
    LocalDate firstDayOfMonth = LocalDate.parse("2016-06-12")
        .with(TemporalAdjusters.firstDayOfMonth());
    System.out.println(firstDayOfMonth);

    ZoneId zoneId = ZoneId.of("Europe/Paris");

    Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
    System.out.println(allZoneIds);

    ZonedDateTime zonedDateTime = ZonedDateTime.of(beginningofDay, zoneId);
    System.out.println(zonedDateTime);

    ZonedDateTime.parse("2015-05-03T10:15:30+01:00[Europe/Paris]");

    ZoneOffset offset = ZoneOffset.of("+02:00");

    OffsetDateTime offsetByTwo = OffsetDateTime.of(beginningofDay, offset);
    System.out.println(offsetByTwo);

  }

}
