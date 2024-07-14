package enumeration.ex2;

/**
 * 타입 안전 열거형 패턴 이용
 */
public class ClassGrade {
    public static final ClassGrade BASIC = new ClassGrade(); // x001
    public static final ClassGrade GOLD = new ClassGrade(); // x002
    public static final ClassGrade DIAMOND = new ClassGrade(); // x003

    // private 생성자 추가
    private ClassGrade() {}
    // 클래스 외부에서 인스턴스를 생성하지 못하도록 함
    // 클래스 내부에서만 인스턴스를 생성하도록 함
}

// static을 사용: 상수를 메서드 영역에 선언
// final을 사용: 인스턴스(참조값)을 변경할 수 없게 함
// 인스턴스의 참조값을 상수로 만들어서 메서드 영역에 선언함

// 제한된 인스턴스 생성: 클래스는 사전에 정의된 인스턴스만 생성
// -> 미리 정의된 값들만 사용하도록 보장
// 타입 안전성: 잘못된 값이 할당되거나 사용되는 것을 컴파일 시점에 방지할 수 있음
