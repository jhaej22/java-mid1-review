package lang.wrapper.test;

public class WrapperTest4 {

    public static void main(String[] args) {
        String str = "100";
        Integer intValue = Integer.parseInt(str);
        int unboxedValue = intValue; // auto-unboxing
        Integer boxedValue = unboxedValue; // auto-boxing

        System.out.println("intValue = " + intValue);
        System.out.println("unboxedValue = " + unboxedValue);
        System.out.println("boxedValue = " + boxedValue);
    }
}
