package lang.system;

import java.util.Arrays;

/**
 * System 클래스와 주요 메서드
 */

public class SystemMain {

    public static void main(String[] args) {
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis); // 현재 시간 (밀리 초)를 반환

        long currentTimeNano = System.nanoTime();
        System.out.println("currentTimeNano = " + currentTimeNano); // 현재 시간 (나노 초)을 반환

        System.out.println("getenv = " + System.getenv()); // 시스템의 환경 변수를 읽음

        System.out.println("properties = " + System.getProperties()); // 시스템의 속성을 읽음

        // 배열을 고속으로 복사
        char[] originalArray = new char[]{'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];
        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);

        System.out.println("copiedArray = " + copiedArray);
        System.out.println("Arrays.toString = " + Arrays.toString(copiedArray));

        System.exit(0); // 프로그램 종료
    }
}

// System 클래스의 주요 메서드
// System.in : 표준 입력
// System.out : 표준 출력
// System.err : 표준 오류 스트림
// System.getenv: 운영체제에서 설정한 환경 변수의 값을 읽음
// System.getProperties: 자바에서 설정한 값의 속성을 읽음
// System.exit: 프로그램을 종료시키고 운영체제에 프로그램 종료의 상태 코드를 전달함
// 상태코드: 0 -> 정상적인 종료 , 0이 아님 -> 오류나 예외적인 종료
