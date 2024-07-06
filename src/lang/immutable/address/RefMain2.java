package lang.immutable.address;

public class RefMain2 {
    public static void main(String[] args) {
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a; // 참조값 대입을 막을 수 있는 방법은 없음
        // 대신에 불변 클래스로 설계해서 이후에 값을 변경할 수 없도록 함
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // b.setValue("부산"); // 필드의 값 변경 시도 -> 불변 객체이므로 컴파일 오류
        b = new ImmutableAddress("부산"); // 새로운 인스턴스 생성
        System.out.println("부산 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

// ImmutableAddress 클래스는 불변 클래스이므로 객체의 값을 변경하려면
// 새로운 인스턴스를 생성해야 한다.

