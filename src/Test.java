import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the year");
        int year = scanner.nextInt();
        System.out.println("Write the month");
        int month = scanner.nextInt();
        System.out.println("Write the day");
        int day = scanner.nextInt();
        scanner.close();
        LocalDate date = LocalDate.of(year, month, day);
        System.out.println(date.getDayOfWeek());
        LocalDate date1 = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
        System.out.println(date1);

    }
}
