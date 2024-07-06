package lang.immutable;

public class StringImmutable2 {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = str1.concat(" java");
        // str1 객체 내부에서 합친 문자열을 가진 새로운 객체를 생성한 후 반환
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}
