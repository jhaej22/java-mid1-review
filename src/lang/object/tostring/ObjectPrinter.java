package lang.object.tostring;

public class ObjectPrinter {
    public static void print(Object obj) {
        String str = "객채 정보 출력: " + obj.toString();
        System.out.println(str);
    }
}

// 다형성을 잘 활용한다는 것 == 다형적 참조와 메서드 오버라이딩을 적절하게 사용
// 1. 다형적 참조
// : print(Object obj), Object 타입을 매개변수로 사용해서 다형적 참조를 사용
// Car, Dog 인스턴스를 포함한 세상의 모든 객체 인스턴스를 인수로 받을 수 있음
// 2. 메서드 오버라이딩
// : 필요에 따라 런타임에 인스턴스의 toString()을 호출할 수 있다.

// OCP 원칙
// Open: 새로운 클래스를 추가하고 toString을 오버라이딩 해서 기능을 확장
// Closed: 새로운 클래스를 추가해도 Object, toString()을 사용하는 클라이언트 코드인
// ObjectPrinter는 변경하지 않아도 된다.

// 정적 의존관계 vs 동적 의존 관계
// 1. 정적 의존관계: 컴파일 시간에 결정됨, 주로 클래스 간의 관계를 의미
// -> 클래스 내에서 사용하는 타입들로 쉽게 파악할 수 있는 관계
// 2. 동적 의존관계: 런타임 시간에 결정됨, 프로그램을 실행해봐야 알 수 있음
// -> 런타임에 어떤 인스턴스를 사용하는지 나타내는 관계

