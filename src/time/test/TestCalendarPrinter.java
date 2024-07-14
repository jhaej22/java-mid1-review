package time.test;

import java.io.*;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class TestCalendarPrinter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("년도를 입력하세요: ");
        int year = Integer.parseInt(br.readLine());
        System.out.print("월을 입력하세요: ");
        int month = Integer.parseInt(br.readLine());

        printCalendar(year, month);
    }

    public static void printCalendar(int year, int month) {
        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1); // 2024-01-01
        LocalDate firstDayOfNextMonth = firstDayOfMonth.plusMonths(1); // 2024-02-01

        int offsetWeekDays = firstDayOfMonth.getDayOfWeek().getValue() % 7;
        // 월요일 = 1 화요일 = 2 .....  일요일 = 0
        System.out.println("Su Mo Tu We Th Fr Sa ");

        for (int i = 0; i < offsetWeekDays; i++) {
            System.out.print("  ");
        }


        LocalDate dayIterator = firstDayOfMonth;
        while (dayIterator.isBefore(firstDayOfNextMonth)) {
            System.out.printf("%2d ", dayIterator.getDayOfMonth());
            if (dayIterator.getDayOfWeek() == DayOfWeek.SATURDAY) {
                System.out.println();
            }
            dayIterator = dayIterator.plusDays(1);
        }
    }
}
