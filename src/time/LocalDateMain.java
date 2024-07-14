package time;

import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        LocalDate ofDate = LocalDate.of(2013, 11, 21);

        System.out.println("오늘 날짜 = " + nowDate);
        System.out.println("지정 날짜 = " + ofDate);

        // 날짜 계산 (불변)
        LocalDate plusDays = ofDate.plusDays(10);
        System.out.println("지정 날짜 + 10일 = " + plusDays);
        // 모든 날짜 클래스는 불변
        // 변경이 발생하는 경우(계산) 새로운 객체를 생성함
        // 반환값을 꼭 받아야함
    }
}

// now(): 현재 날짜를 기준으로 생성
// of(): 특정 날짜를 기준으로 생성
// plusDays(): 특정일을 더하여 생성