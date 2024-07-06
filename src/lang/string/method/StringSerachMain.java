package lang.string.method;

public class StringSerachMain {
    public static void main(String[] args) {
        String str = "Hello, Java! Welcome to Java world.";

        System.out.println(str.contains("Java"));
        // contains() : 문자열에 특정 문자열이 속해있는지
        System.out.println(str.indexOf("Java"));
        // indexof() : 특정 문자열이 시작하는 인덱스
        System.out.println(str.indexOf("Java", 10));
        // 인덱스 10부터 시작해서 특정 문자열이 시작하는 인덱스
        System.out.println(str.indexOf("e", 2));
        System.out.println(str.lastIndexOf("Java"));
    }
}
