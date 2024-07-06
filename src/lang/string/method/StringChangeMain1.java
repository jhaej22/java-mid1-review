package lang.string.method;

public class StringChangeMain1 {
    public static void main(String[] args) {
        String str = "Hello, Java! Welcome to Java";

        System.out.println(str.substring(7));
        System.out.println(str.substring(7, 12));
        // subString(): 문자열의 부분 문자열

        System.out.println(str.concat("!!!"));
        // concat(): 문자열에 다른 문자열 결합
        String str2 = str + "!!!";
        System.out.println(str2);

        System.out.println(str.replace("Java", "World"));
        System.out.println(str.replaceFirst("Java", "World"));
        // replace() : 특정 문자열을 다른 문자로 바꿈
        // replaceFirst(): 특정 문자열의 중복 중 가장 첫번째 문자열을 바꿈
    }
}
