package javacore.dates.test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.*;

class MyTemporalAdjuster implements TemporalAdjuster {

    @Override
    public Temporal adjustInto(Temporal temporal) {
        return temporal;
    }
}

public class TestInstant {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDateTime dt = LocalDateTime.now();
        LocalTime time = LocalTime.now();
        Instant instant = Instant.now();

        System.out.println(dt);
        System.out.println(time);
        System.out.println(instant);

        Duration du = Duration.between(instant, instant.plus(5, ChronoUnit.SECONDS));
        Duration du2 = Duration.between(dt, dt.plusDays(9));

        // Period can handle dates without time like date and LocalDate
        Period period = Period.between(date, date.plusDays(12));

        //TimeAdjusters....
        TemporalAdjusters.firstDayOfNextMonth();

        System.out.println(dt.with(new MyTemporalAdjuster()));
        String dateStr = "7/28/2024 9:00:10";
        System.out.println(LocalDateTime.parse(dateStr, DateTimeFormatter.ofPattern("M/dd/yyyy H:mm:ss")));
    }
}
