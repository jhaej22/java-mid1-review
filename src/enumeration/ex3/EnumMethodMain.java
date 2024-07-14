package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {

    public static void main(String[] args) {
        Grade[] values = Grade.values();
        System.out.println("values = " + Arrays.toString(values));
        for (Grade value : values) {
            System.out.println("name = " + value.name() + ", ordinal = " +
            value.ordinal());
        }

        // String -> ENUM 변환 (잘못된 문자면 IllegalArgumentExcpetion 예외 발생
        String input = "GOLD";
        Grade gold = Grade.valueOf(input);
        System.out.println("gold = " + gold);
    }
}

// 모든 열거형은 java.lang.Enum 클래스를 자동으로 상속 받음
// ENUM의 주요 메서드
// values(): 모든 ENUM상수를 포함하는 배열을 반환
// valueOf(String name): 주어진 문자열과 일치하는 ENUM 상수를 반환
