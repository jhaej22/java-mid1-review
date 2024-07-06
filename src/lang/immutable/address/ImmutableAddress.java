package lang.immutable.address;

/**
 * 불변 클래스를 만드는 방법
 * 어떻게든 필드, 멤버 변수의 값을 변경할 수 없도록 클래스를 설계
 */

public class ImmutableAddress {
    private final String value;
    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "ImmutableAddress{" +
                "value='" + value + '\'' +
                '}';
    }
}

// 내부의 값이 변경되면 안되기 때문에 final로 선언
// 값을 변경할 수 있는 setValue()를 제거
// 이 클래스는 생성자를 통해서만 값을 설정할 수 있음 -> 이후에 변경 불가

