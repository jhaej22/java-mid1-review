package lang.immutable.address;

public class RefMain1_1 {
    public static void main(String[] args) {
        // 참조형 변수는 하나의 인스턴스를 공유할 수 있음
        Address a = new Address("서울");
        Address b = a; // a의 참조값을 복사하여 b에 대입
        // a, b는 같은 인스턴스를 참조함
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("부산");
        System.out.println("부산 -> b");
        System.out.println("a = " + a); // 사이드 이펙트 발생
        System.out.println("b = " + b);
    }
}

// 사이드 이펙트: 주된 작업 외에 추가적인 부수 효과를 일으키는 것
// -> 프로그램의 특정 부분에서 발생한 변경이 의도치 않게 다른 부분에 영향을 미침
// 예를 들어, 여기서는 b의 인스턴스의 값을 부산으로 바꿀려고 했지만
// a도 같은 인스턴스를 참조하므로 서울에서 부산으로 값이 같이 바뀜