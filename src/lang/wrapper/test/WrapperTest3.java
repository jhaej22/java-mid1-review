package lang.wrapper.test;

public class WrapperTest3 {

    public static void main(String[] args) {
        String str = "100";
        Integer intValue = Integer.parseInt(str); // 문자열 -> 래퍼 타입 변환
        int unboxedValue = intValue.intValue(); // 래퍼 타입 -> 기본형 타입 변환 (언박싱)
        Integer boxedValue = Integer.valueOf(unboxedValue); // 기본형 타입 -> 래퍼 타입(박싱)

        System.out.println("intValue = " + intValue);
        System.out.println("unboxedValue = " + unboxedValue);
        System.out.println("boxedValue = " + boxedValue);
    }
}
