package time;

import java.time.LocalTime;

public class LocalTimeMain {

    public static void main(String[] args) {
        LocalTime nowTime = LocalTime.now();
        LocalTime ofTime = LocalTime.of(9, 10, 30);

        System.out.println("현재 시간 = " + nowTime);
        System.out.println("지정 시간 = " + ofTime);

        // 시간 계산 (불변)
        LocalTime ofTimePlus = ofTime.plusSeconds(30);
        System.out.println("지정 시간 + 30초 = " + ofTimePlus);
        // 모든 날짜 클래스는 불변이므로 값이 변경되면 새로운 객체를 생성
        // 반환값을 받아줘야함
    }
}
