package time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class LocalDateTimeMain {

    public static void main(String[] args) {
        LocalDateTime nowDt = LocalDateTime.now();
        LocalDateTime ofDt = LocalDateTime.of(2016, 8, 16, 8, 10, 1);
        System.out.println("현재 날짜시간 = " + nowDt);
        System.out.println("지정 날짜시간 = " + ofDt);

        // 날짜와 시간 분리
        LocalDate localDate = ofDt.toLocalDate();
        LocalTime localTime = ofDt.toLocalTime();
        System.out.println("localDate = " + localDate);
        System.out.println("localTime = " + localTime);

        // 날짜와 시간 합체
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("localDateTime = " + localDateTime);

        // 날짜시간 계산 (불변)
        LocalDateTime ofDtPlus = ofDt.plusDays(1000);
        System.out.println(ofDtPlus);
        LocalDateTime ofDtPlus1Year = ofDt.plusYears(1);
        System.out.println(ofDtPlus1Year);

        // 날짜시간 비교
        System.out.println(nowDt.isBefore(ofDt));
        System.out.println(nowDt.isAfter(ofDt));
        System.out.println(nowDt.isEqual(ofDt));
    }
}

// LocalDateTime.of(localDate, localTime): 날짜와 시간 합체
// isEqual(): 시간적으로 비교해서 같으면 true 반환
// equals(): 객체의 타입, 타임존 등의 내부 데이터의 구성요소가 모두 같아야 true 반환
