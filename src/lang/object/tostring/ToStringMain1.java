package lang.object.tostring;

public class ToStringMain1 {

    public static void main(String[] args) {
        Object object = new Object();
        String str = object.toString();

        System.out.println(str); // toString() 메서드의 반환값 출력

        System.out.println(object); // object 직접 출력
    }
}

// Object 클래스의 toString() 메서드
// : 객체의 정보를 문자열 형태로 반환
// 기본적으로 패키지, 객체의 이름과 참조값을 담고 있음

// System.out.println() 메서드는 내부에서 toString() 메서드를 호출함
// -> toString()을 직접 호출할 필요 없이 객체를 바로 전달하면 객체의 정보를 출력할 수 있음
