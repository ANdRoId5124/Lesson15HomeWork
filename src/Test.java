import java.sql.SQLOutput;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        Test4 test4 = new Test4();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write 0 or 1");
        int path = scanner.nextInt();
        if(path == 0){
            System.out.println("Write your word");
            String word = scanner.next();
            StringBuilder stringBuilder = new StringBuilder(word);
            StringBuilder output;
            output = test2.methodOfInterface(stringBuilder);
            System.out.println(output);
        } else if (path == 1) {
            System.out.println("Write your digit for calculate factorial");
            Integer digitForFactorial = scanner.nextInt();
            Integer output2;
            output2 = test4.methodOfInterface(digitForFactorial);
            System.out.println(output2);

        }



       /* Scanner scanner = new Scanner(System.in);
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
        System.out.println(date1);*/

    }


}
