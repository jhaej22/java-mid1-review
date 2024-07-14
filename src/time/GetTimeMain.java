package time;

/**
 * 날짜와 시간을 조회하기 위해서는?
 * 날짜와 시간 항목 중에서 어떤 필드를 조회할지 선택해야함
 * ChronoField가 사용됨
 */

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class GetTimeMain {

    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2030, 1, 1, 13, 30, 59);
        System.out.println(dt.get(ChronoField.YEAR));
        System.out.println(dt.get(ChronoField.MONTH_OF_YEAR));
        System.out.println(dt.get(ChronoField.DAY_OF_MONTH));
        System.out.println(dt.get(ChronoField.HOUR_OF_DAY));
        System.out.println(dt.get(ChronoField.MINUTE_OF_HOUR));
        System.out.println(dt.get(ChronoField.SECOND_OF_MINUTE));

        System.out.println("편의 메서드 사용");
        System.out.println(dt.getYear());
        System.out.println(dt.getMonthValue());
        System.out.println(dt.getDayOfMonth());
        System.out.println(dt.getHour());
        System.out.println(dt.getMinute());
        System.out.println(dt.getSecond());

        System.out.println("편의 메서드 없음");
        System.out.println(dt.get(ChronoField.MINUTE_OF_DAY));
        System.out.println(dt.get(ChronoField.SECOND_OF_DAY));
    }
}
