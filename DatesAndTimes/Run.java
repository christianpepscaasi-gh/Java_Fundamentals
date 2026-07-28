import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class Run{
    public static void main(String[] args){

        // How to work with Dates and Times using Java
        // LocalDate, LocalTime, localDateTime, UTC timestamp

        LocalDate date =  LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        Instant instant = Instant.now();

        System.out.println(date);//date
        System.out.println(time);//time
        System.out.println(dateTime);//date and time
        System.out.println(instant);//utc

        System.out.println("============================");

        //custom

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy | HH:mm:ss");
        String newDateTime = dateTime.format(formatter);

        System.out.println(newDateTime);

        System.out.println("============================");

        LocalDate date2 = LocalDate.of(2026, 7, 23);
        System.out.println(date2);

        System.out.println("============================");

        //Compare Dates:

        LocalDateTime compareDate1 = LocalDateTime.of(2025,12, 25, 12, 0, 0);
        LocalDateTime compareDate2 = LocalDateTime.of(2026,1, 1, 0, 0, 0);

        if(compareDate1.isBefore(compareDate2)){
            System.out.println(compareDate1 + " is earlier than " + compareDate2);
        } else if (compareDate2.isBefore(compareDate1)) {
            System.out.println(compareDate2 + " is earlier than " + compareDate1);
        } else if (compareDate1.equals(compareDate2)) {
            System.out.println(compareDate1 + " is equal to " + compareDate2);
        }

    }
}