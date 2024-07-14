package time;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

/**
 * OffsetDateTime 클래스
 * : LocalDateTime + ZoneOffset 이 합쳐진 클래스
 * -> 타임존은 없음 (ZoneId 클래스가 없음)
 * -> UTC로부터의 시간 차이인 고정된 오프셋만 포함됨
 */
public class OffsetDateTimeMain {
    public static void main(String[] args) {
        OffsetDateTime nowOdt = OffsetDateTime.now();
        System.out.println("nowOdt = " + nowOdt);

        LocalDateTime ldt = LocalDateTime.of(2030, 1, 1, 13, 30, 50);
        System.out.println("ldt = " + ldt);
        OffsetDateTime odt = OffsetDateTime.of(ldt, ZoneOffset.of("+01:00"));
        System.out.println("odt = " + odt);
    }
}

// ZoneOffset 클래스: UTC와의 시간차이인 오프셋만 제공
