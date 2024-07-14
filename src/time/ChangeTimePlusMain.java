package time;

/**
 * 날짜와 시간을 조작하려면 어떤 시간 단위를 변경할지 선택
 * 이 때 ChronoUnit이 사용됨
 */

import java.time.*;
import java.time.temporal.ChronoUnit;

public class ChangeTimePlusMain {

    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2018, 1, 1, 13, 30, 59);
        System.out.println("ldt = " + ldt);

        LocalDateTime plusLdt1 = ldt.plus(10, ChronoUnit.YEARS);
        System.out.println("plusLdt1 = " + plusLdt1);

        LocalDateTime plusLdt2 = ldt.plusYears(10);
        System.out.println("plusLdt2 = " + plusLdt2);

        Period period = Period.ofYears(10);
        LocalDateTime plusLdt3 = ldt.plus(period);
        System.out.println("plusLdt3 = " + plusLdt3);
    }
}
