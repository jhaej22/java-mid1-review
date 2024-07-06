package lang.immutable;

public class StringImmutable {

    public static void main(String[] args) {
        String str = "hello";
        str.concat(" java");
        System.out.println("str = " + str);
    }
}

// String은 불변 객체이므로 한번 생성한 후에는 내부의 값이 바뀌지 않음
// 즉 문자열을 합쳐도 바뀌지 않고 출력됨

