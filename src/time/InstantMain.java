package time;

import java.time.Instant;
import java.time.ZonedDateTime;

/**
 * Instant 클래스: Epoch 시간을 다루는 클래스
 * 1970년 1월 1일 0시 0분 0초를 기준으로 얼마나 초가 흘렀는지 알려줌
 */

public class InstantMain {

    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println("now = " + now);

        ZonedDateTime zdt = ZonedDateTime.now();
        Instant from = Instant.from(zdt);
        System.out.println("from = " + from);

        Instant epochStart = Instant.ofEpochSecond(0);
        System.out.println("epochStart = " + epochStart);

        // 계산
        Instant later = epochStart.plusSeconds(3600);
        System.out.println("later = " + later);
    }
}
