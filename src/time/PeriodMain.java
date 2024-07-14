package time;

import java.time.LocalDate;
import java.time.Period;

/**
 * Period 클래스: 년, 월, 일을 다루는 클래스
 */

public class PeriodMain {
    public static void main(String[] args) {
        Period period = Period.ofDays(10);
        // Period.of() 메서드
        // 특정 기간을 지정해서 Period를 생성
        System.out.println("period = " + period);

        // 계산에 사용
        LocalDate currentDate = LocalDate.of(2030, 1, 1);
        LocalDate plusDate = currentDate.plus(period);
        System.out.println("현재 날짜: " + currentDate);
        System.out.println("더한 날짜: " + plusDate);

        // 기간 차이
        LocalDate startDate = LocalDate.of(2023, 1, 1);
        LocalDate endDate = LocalDate.of(2023, 4, 2);
        Period between = Period.between(startDate, endDate);
        System.out.println("기간: " + between.getMonths() + "개월 " + between.getDays() + "일");
    }
}
