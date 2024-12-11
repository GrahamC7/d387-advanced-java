package edu.wgu.d387_sample_code.timezone;

import org.springframework.web.bind.annotation.CrossOrigin;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@CrossOrigin(origins ="http://localhost:4200")

public class TimeConversion {
    public static String getTime() {
        ZonedDateTime time = ZonedDateTime.now();

        ZonedDateTime ET = time.withZoneSameInstant(ZoneId.of("America/New_York"));
        ZonedDateTime MT = time.withZoneSameInstant(ZoneId.of("America/Denver"));
        ZonedDateTime UTC = time.withZoneSameInstant(ZoneId.of("UTC"));

        String timeLayout = "hh:mm a";
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern(timeLayout);

        String timeDisplay = ET.format(timeFormatter) + " ET / " + MT.format(timeFormatter) + " MT / " + UTC.format(timeFormatter) + " UTC";
        return timeDisplay;
    }
}
