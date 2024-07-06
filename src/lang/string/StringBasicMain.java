package lang.string;

/**
 * String 클래스를 통해 문자열을 생성하는 방법
 * 1. 쌍따옴표 사용
 * 2. 객체 사용
 */

public class StringBasicMain {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}

// String은 클래스이지만 "hello"를 대입하면 자바가 자동으로 객체를 생성해서 대입해줌
