package lang.wrapper;

/**
 * Auto-boxing & Auto-unboxing
 */

public class AutoBoxingMain2 {
    public static void main(String[] args) {
        // Primitive -> Wrapper
        int value = 7;
        Integer boxedValue = value; // Auto-boxing
        // 컴파일 단계에서 자바가 자동으로
        // Integer boxedValue = Integer.valueOf(value); 추가

        // Wrapper -> Primitive
        int unboxedValue = boxedValue; // Auto-unboxing
        // 컴파일 단계에서 자바가 자동으로
        // int unboxedValue = boxedValue.intValue(); 추가

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}
