package lang.string;

/**
 * String 클래스에서 비교할 때는 항상 equals() 메서드를 사용해야함
 * String 클래스는 내부 문자열 값을 비교하도록 equals() 메서드를 재정의 해둠
 */

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("new String() == 비교: " + (str1 == str2)); // false
        System.out.println("new String() equals() 비교: " + (str1.equals(str2))); // true

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("리터럴 == 비교: " + (str3 == str4)); // true
        // new String()과 다르게 문자열 리터럴을 사용하면
        // 문자열 풀을 이용하기 때문에 같은 참조값을 갖게 됨
        System.out.println("리터럴 equals() 비교: " + (str3.equals(str4))); // true
    }
}

// == 연산자는 new String()을 사용할 때와 문자열 리터럴 일때 결과가 서로 다름
// 즉, String 클래스를 비교할 떄는 무조건 String클래스가 제공하는 equals()메서드 사용해야함
