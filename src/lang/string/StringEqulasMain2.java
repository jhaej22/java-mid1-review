package lang.string;

public class StringEqulasMain2 {

    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("메서드 호출 비교1: " + isSame(str1, str2));

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("메서드 호출 비교1: " + isSame(str3, str4));

    }

    public static boolean isSame(String x, String y) {
        //return x == y;
        return x.equals(y);
    }
}

// isSame()메서드를 개발하는 사람 입장에서는 매개변수로 넘어오는 것이
// new String()을 사용한 것인지 문자열 리터럴을 사용하는 것인지 알 수 없음
// String 클래스에서는 == 연산자는 어떤 것을 사용했는지에 따라 참 거짓 값이 바뀜
// equals()메서드는 둘다 똑같은 값 (내부의 문자열이 같은지 메서드 재정의)
