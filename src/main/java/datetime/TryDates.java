package datetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class TryDates {
  public static void main(String[] args) {
    String s = "Hello";
    s = s.concat(" world");
    System.out.println(s);
    LocalDate today = LocalDate.now();
    LocalDate twoDaysHence = today.plusDays(2);
//    LocalDate odd = today.plus(3, ChronoUnit.MINUTES);
    System.out.println(today);
    System.out.println(twoDaysHence);

//    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMMM/yy HH");
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMMM/yy");
    System.out.println(formatter.format(twoDaysHence));

    Period p = Period.of(1, 14, 100);
    System.out.println("Period is " + p);
    p = p.normalized();
    System.out.println("Normalized is " + p);
  }
}
