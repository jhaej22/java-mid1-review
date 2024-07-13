package lang.math;

/**
 * Math 클래스와 주요 메서드
 */

public class MathMain {
    public static void main(String[] args) {
        // 기본 연산 메서드
        System.out.println(Math.max(10, 20));
        System.out.println(Math.min(10, 20));
        System.out.println(Math.abs(-10));

        // 반올림 및 정밀도 메서드
        System.out.println(Math.ceil(2.1)); // 올림
        System.out.println(Math.floor(2.7)); // 내림
        System.out.println(Math.round(2.5)); // 반올림

        // 기타 유용한 메서드
        System.out.println(Math.sqrt(4)); // 제곱근
        System.out.println(Math.random()); // 0.0 ~ 1.0 사이의 double 값
    }
}

// 랜덤이 필요할 때 방법 2가지
// 1. Math.random() 메서드 사용 -> 이 방법도 결국에 메서드 내부에서 Random 클래스를 사용
// 2. Random 클래스 사용
