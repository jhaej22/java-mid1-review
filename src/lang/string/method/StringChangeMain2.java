package lang.string.method;

public class StringChangeMain2 {
    public static void main(String[] args) {
        String strWithSpaces = " Java Programming ";

        System.out.println(strWithSpaces);

        System.out.println(strWithSpaces.toLowerCase());
        System.out.println(strWithSpaces.toUpperCase());
        // 문자열을 모두 대문자나 소문자로 바꿈

        System.out.println(strWithSpaces.trim());
        System.out.println(strWithSpaces.strip());
        // trim(), strip(): 공백 제거

        System.out.println(strWithSpaces.stripLeading());
        System.out.println(strWithSpaces.stripTrailing());
        // stripLeading(): 앞 공백 제거
        // stripTrailing(): 뒤 공백 제거
    }
}
