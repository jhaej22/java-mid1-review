package time;

import java.time.ZoneId;

/**
 * ZoneId 클래스: 이 클래스를 통해 타임존을 제공
 */

// 자바는 타임존을 ZoneId 클래스로 제공
// 타임존 -> 일광 절약 시간 정보와 오프셋 정보(UTC로부터의 시간 차)가 들어있음
public class ZoneIdMain {

    public static void main(String[] args) {
        for (String availableZoneId : ZoneId.getAvailableZoneIds()) {
            ZoneId zoneId = ZoneId.of(availableZoneId);
            System.out.println(zoneId + " | " + zoneId.getRules());
        }

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("ZoneId.systemDefault = " + zoneId);

        ZoneId seoulZoneId = ZoneId.of("Asia/Seoul");
        System.out.println("seoulZoneId = " + seoulZoneId);
    }
}
