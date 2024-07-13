package lang.wrapper;

/**
 * 래퍼 클래스의 주요 메서드와 기능
 */

public class WrapperUtilsMain {

    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(10); // 숫자, 래퍼 객체 반환
        Integer i2 = Integer.valueOf("10"); // 문자열, 래퍼 객체 반환
        int intValue = Integer.parseInt("10"); // 문자열 전용, 기본형 반환
        // valueOf(): 래퍼 타입을 반환, 숫자와 문자열 모두 가능
        // parseInt(): 문자열 등을 기본형으로 반환

        // 비교
        int compareResult = i1.compareTo(20);
        System.out.println("compareResult = " + compareResult);
        // compareTo(): 내 값과 인수로 넘어온 값을 비교
        // 내 값이 크면 1 같으면 0 작으면 -1을 반환
        // 10 < 20 이므로 -1 반환

        // 산술 연산
        System.out.println("sum: " + Integer.sum(10, 20));
        System.out.println("min: " + Integer.min(10, 20));
        System.out.println("max: " + Integer.max(10, 20));
        // sum(), min(), max(): 합, 최대/최솟값을 반환
    }
}
