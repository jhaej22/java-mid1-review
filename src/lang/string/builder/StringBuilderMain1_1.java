package lang.string.builder;

/**
 * StringBuilder: 가변 String 클래스
 * 문자열을 변경하거나 할 때 새로운 객체를 생성하지 않아도 됨
 * 주로 변경이 끝난 뒤 toString() 클래스로 바꿔줌
 */

public class StringBuilderMain1_1 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb = " + sb);
        // append() 메서드: 기존 문자열에 새로운 문자열을 더함

        sb.insert(4, "Java");
        System.out.println(sb);
        // insert() 메서드: 인덱스의 부분에 새로운 문자열을 삽입

        sb.delete(4, 8);
        System.out.println(sb);
        // delete() 메서드: 특정 인덱스의 문자열을 삭제

        sb.reverse();
        System.out.println(sb);
        // reverse() 메서드: 문자열의 순서를 뒤집음

        // StringBuilder -> String 클래스로 바꿈
        String str = sb.toString();
        System.out.println(str);
        // toString() 메서드: String 클래스로 바꿔줌
    }
}

// String 클래스(불변 클래스)
// : 한번 생성되면 그 내용을 변경할 수 없음
// 문자열에 변화가 생기면 그 때마다 새로운 String 객체가 생성됨
// 이 과정에서 메모리와 처리시간을 더 많이 소모

// StringBuilder 클래스(가변 클래스)
// : 객체 안에서 문자열을 추가, 삭제, 수정할 수 있음
// 그 때마다 새로운 객체를 생성할 필요 없음
// 메모리 사용을 줄이고 처리시간을 단축할 수 있음
// -> 사이드 이펙트에 주의
