package lang.wrapper;

/**
 *  래퍼 클래스(WrapperClass)
 * : 기본형의 객체 버전
 * : 불변 클래스, equals()로 비교해야 함
 * ex) Byte, Short, Integer, Long, Float, Double, Character, Boolean
 */

public class WrapperClassMain {

    public static void main(String[] args) {

        System.out.println("래퍼 객체 생성");
        Integer integerObj1 = Integer.valueOf(10);
        Integer integerObj2 = Integer.valueOf(10);
        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);

        System.out.println("integerObj = " + integerObj1);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);

        System.out.println("내부 값 읽기");
        int intValue = integerObj1.intValue();
        System.out.println("intValue = " + intValue);
        long longValue = longObj.longValue();
        System.out.println("longValue = " + longValue);

        System.out.println("비교");
        System.out.println("==: " + (integerObj1 == integerObj2));
        // 래퍼 클래스는 객체이기 때문에 == 연산자 사용시 인스턴스의 참조값을 비교함
        System.out.println("equals: " + (integerObj1.equals(integerObj2)));
        // 래퍼클래스는 내부의 값을 비교하도록 equals() 메서드를 재정의 해두었음
        // 래퍼클래스는 객체를 그대로 출력해도 내부에 있는 값을 문자로 출력하도록 toString()을 재정의 해두었음
    }
}

// 박싱: 기본형을 래퍼클래스로 변경하는 것 (마치 박스에 물건을 넣는 것과 유사)
// 언박싱: 래퍼클래스에 들어있는 기본형을 다시 꺼냄 (박스에서 다시 물건을 꺼내는 것과 유사)
