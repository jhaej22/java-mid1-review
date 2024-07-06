package lang.string;

public class StringConcatMain {

    public static void main(String[] args) {
        String a = "hello";
        String b = "java";

        String result1 = a.concat(b);
        String result2 = a + b;
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}

// 원칙적으로 String은 클래스이기 때문에 a, b(참조형 변수)에는 참조값을 담고 있음
// 문자열을 더할 때는 String이 제공하는 concat()메서드를 사용해야 함
// 하지만 문자열은 자주 다루어지기 때문에 + 연산을 제공함
