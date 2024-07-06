package lang.immutable.address;

/**
 * 사이드 이펙트의 해결 방안
 * -> 애초에 다른 인스턴스 두개를 만듦
 */
public class RefMain1_2 {
    public static void main(String[] args) {
        Address a = new Address("서울"); // a = x001
        Address b = new Address("서울"); // b = x002
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("부산");
        System.out.println("부산 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

// 사이드 이펙트가 발생하지 않게 하려면 두개의 인스턴스를 만듦
// 즉, 서로 다른 객체를 참조해서 여러 변수에서 하나의 객체를 공유하지 않도록 만듦
// 문제점: 여러 변수에서의 참조값 공유를 막을 수 있는 방법이 없음

// 기본형은 항상 값을 복사하기 때문에 값이 같더라도 전혀 다른 두 개의 값이지만
// 참조형을 복사해서 대입하는 경우 여러 변수에서 같은 객체를 공유할 수 도 있음
