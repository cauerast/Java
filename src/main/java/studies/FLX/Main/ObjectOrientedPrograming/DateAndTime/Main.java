package studies.FLX.Main.ObjectOrientedPrograming.DateAndTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // (LocalDate, LocalTime, LocalDateTime, UTC timestamp);

        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        Instant instant = Instant.now();
        System.out.println(instant);


        // custom format

        LocalDateTime dateTime1 = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String newDateTime = dateTime1.format(formatter);
        System.out.println(newDateTime);

        // local date of another day

        LocalDateTime date2 = LocalDateTime.of(2024, 12, 25, 12, 0, 0);
        LocalDateTime date3 = LocalDateTime.of(2025, 1, 1, 12, 0, 0);

        if(date2.isBefore(date3)){
            System.out.println(date2 + " is earlier than " + date3);
        }
        else if(date2.isAfter(date3)){
            System.out.println(date2 + " is later than " + date3);
        }
        else if(date2.isEqual(date3)){
            System.out.println(date2 + " is equal to " + date3);
        }




    }
}
